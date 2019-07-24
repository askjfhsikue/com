package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import test.entity.TUser;
import test.service.impl.UserServiceImpl;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    /* 获取校验码 */
    @RequestMapping("/getVerifyCode")
    public void generate(HttpServletResponse response, HttpSession session) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String verifyCodeValue = drawImg(output);
        // 将校验码保存到session中
        session.setAttribute("verifyCodeValue", verifyCodeValue);

        try {
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    /* 绘制验证码 */
    private String drawImg(ByteArrayOutputStream output) {
        String code = "";
        // 随机产生4个字符
        for (int i = 0; i < 4; i++) {
            code += randomChar();
        }
        int width = 70;
        int height = 25;
        BufferedImage bi = new BufferedImage(width, height,
                BufferedImage.TYPE_3BYTE_BGR);
        Font font = new Font("Times New Roman", Font.PLAIN, 20);
        // 调用Graphics2D绘画验证码
        Graphics2D g = bi.createGraphics();
        g.setFont(font);
        Color color = new Color(66, 2, 82);
        g.setColor(color);
        g.setBackground(new Color(226, 226, 240));
        g.clearRect(0, 0, width, height);
        FontRenderContext context = g.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(code, context);
        double x = (width - bounds.getWidth()) / 2;
        double y = (height - bounds.getHeight()) / 2;
        double ascent = bounds.getY();
        double baseY = y - ascent;
        g.drawString(code, (int) x, (int) baseY);
        g.dispose();
        try {
            ImageIO.write(bi, "jpg", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;
    }

    /* 获取随机参数 */
    private char randomChar() {
        Random r = new Random();
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
        return s.charAt(r.nextInt(s.length()));
    }

    //显示登录界面
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(" Login被调用");
        modelAndView.setViewName("login");
        return modelAndView;
    }
    //显示登录界面
        @RequestMapping("/test")
        @ResponseBody
        public ModelAndView test(HttpServletRequest request){
            ModelAndView modelAndView = new ModelAndView();
            System.out.println(" Test被调用");
            modelAndView.setViewName("test");
            return modelAndView;
    }

    /**
     * value指定映射实际地址，method指定请求方法类型，produces指定返回类型
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody //
    public ModelAndView register(@RequestParam("username")String userName, @RequestParam("password")String password){

        System.out.println("register被调用");
        ModelAndView mv = new ModelAndView();
        TUser tUser=new TUser();
        tUser.setUserName(userName);

        tUser.setPassword(password);
        boolean bool=userServiceImpl.register(tUser);
        System.out.println(bool);
        if(bool==true){
            mv.addObject("message","成功");
        }else {
            mv.addObject("message","失败");
        }
        mv.setViewName("welcome");
        return mv;
    }

    @RequestMapping(value = "checkLogin",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ModelMap checkLogin(@RequestBody Map<String, Object> map, HttpServletRequest request){

        HttpSession session = request.getSession();
        String sessionVerifyCode = (String) session.getAttribute("verifyCodeValue");

        System.out.println("checkLogin被调用");
        ModelMap modelMap=new ModelMap();
        String userName=map.get("username").toString();
        String password=map.get("password").toString();
        String verifyCode = map.get("verifyCode").toString();
        System.out.println(userName);

        if(userServiceImpl.checkLogin(userName,password)){
            boolean bool=(verifyCode.equalsIgnoreCase(sessionVerifyCode));
            if (!verifyCode.equalsIgnoreCase(sessionVerifyCode)) {
                modelMap.put("state",false);
                modelMap.put("message","验证码错误");
            }else {
                modelMap.put("state", true);
                modelMap.put("message", "成功");
            }
        }else {
            modelMap.put("state",false);
            modelMap.put("message","用户名或者密码错误");
        }
        System.out.println(modelMap.get("state"));
        System.out.println(modelMap.get("message"));
        return  modelMap;

    }

}
