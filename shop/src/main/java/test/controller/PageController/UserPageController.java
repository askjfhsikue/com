package test.controller.PageController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/user")
public class UserPageController {

    @Autowired
    UserServiceImpl userServiceImpl;




}
