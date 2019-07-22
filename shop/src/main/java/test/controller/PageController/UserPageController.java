package test.controller.PageController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import test.entity.TUser;
import test.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/userPage")
public class UserPageController {

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

    @RequestMapping(value = "/register")
    @ResponseBody
    public ModelAndView register(@RequestParam("username")String userName,@RequestParam("password")String password){

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

}
