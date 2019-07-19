package test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import test.entity.User;
import test.service.UserMapperService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired UserMapperService userMapperService;
  private static final Log logger = LogFactory.getLog(UserController.class);

  @RequestMapping("/test")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    logger.info("被调用");
    ModelAndView mv = new ModelAndView();
    User user = userMapperService.selectById(1);
    if (user != null) {
      mv.addObject("message", user.getId() + " " + user.getName());
    } else {
      mv.addObject("message", " 失败 ");
    }
    mv.setViewName("Welcome");
    return mv;
  }

  // 显示登录界面
  @RequestMapping("/login")
  public ModelAndView login(HttpServletRequest request) {
    ModelAndView modelAndView = new ModelAndView();
    System.out.println(" Login被调用");
    modelAndView.setViewName("Login");
    return modelAndView;
  }

  @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
  public String checkLogin() {
    System.out.println(" checkLogin被调用");
    // ModelAndView modelAndView = new ModelAndView();
    // modelAndView.setViewName("Test");
    // return modelAndView;
    return "Test";
  }
}
