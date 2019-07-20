package test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import test.entity.TUser;
import test.service.UserService;
import test.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

//    private static final Log looger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/register")
    @ResponseBody
    public ModelAndView register(@RequestParam("username")String userName,@RequestParam("password")String password){
//        looger.info("UserController被调用！");
        ModelAndView mv = new ModelAndView();
        TUser tUser=new TUser();
        tUser.setUserName(userName);
        tUser.setPassword(password);
        if(userServiceImpl.register(tUser)){
            mv.addObject("message","成功");
        }else {
            mv.addObject("message","失败");
        }
        mv.setViewName("Welcome");
        return mv;
    }

}
