package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import test.entity.TUser;
import test.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;


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
        System.out.println("checkLogin被调用");
        ModelMap modelMap=new ModelMap();
        String userName=map.get("username").toString();
        String password=map.get("password").toString();
        System.out.println(userName);

        if(userServiceImpl.checkLogin(userName,password)){
            modelMap.put("state",true);
            modelMap.put("message","成功");
        }else {
            modelMap.put("state",false);
            modelMap.put("message","失败");
        }
        System.out.println(modelMap.get("state"));
        return  modelMap;

    }

}
