package test.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import test.entity.User;
import test.service.UserMapperService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapperService userMapperService;
    //private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/test")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)throws Exception{
        System.out.println("handleRequest被调用");
        ModelAndView mv = new ModelAndView();
        User user=  userMapperService.selectById(1);
        if(user!=null) {
            mv.addObject("message",   user.getId()+" "+user.getName());
        }else {
            mv.addObject("message", " 失败 " );

        }
        mv.setViewName("Welcome");
        return  mv;
    }
    //显示登录界面
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(" Login被调用");
        modelAndView.setViewName("Test");
        return modelAndView;
    }
    //显示json
    @RequestMapping("/json")
    @ResponseBody
    public ModelAndView json(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(" Login被调用");
        modelAndView.setViewName("JSONTest1");
        return modelAndView;
    }


    //@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    //@ResponseBody//向前端返回数据
    //public ModelAndView  checkLogin(@RequestParam("username")String username,@RequestParam("password")String password){
    //    System.out.println(" checkLogin被调用");
    //    ModelAndView mv = new ModelAndView();
    //    //Map<String,String> map=new Hashtable<>();
    //    //String username = map.get("username");
    //    //String password = map.get("password");
    //
    //    if(userMapperService.checkLogin(username,password)){
    //        mv.addObject("status","true");
    //        mv.addObject("name",username);
    //        mv.addObject("password",password);
    //        mv.addObject("message","成功");
    //    }else {
    //        mv.addObject("status","false");
    //        mv.addObject("name",username);
    //        mv.addObject("password",password);
    //        mv.addObject("message","失败");
    //        }
    //    mv.setViewName("Test");
    //    return  mv;
    //}

    //登录验证
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody//响应体  用于向前端返回数据
    public Map<String ,Object> Login(@RequestBody Map<String, Object> map, HttpServletRequest request) {

        System.out.println(" checkLogin被调用");
        Map<String,Object> stringMap=new Hashtable<>();

        String username = "" + map.get("username");
        String password = "" + map.get("password");
        if(userMapperService.checkLogin(username,password)){
            stringMap.put("status","true");
            stringMap.put("name",username);
            stringMap.put("password",password);
            stringMap.put("message","成功");
                }else {
            stringMap.put("status","false");
            stringMap.put("name",username);
            stringMap.put("password",password);
            stringMap.put("message","失败");
                    }

                return  stringMap;
    }



    }
