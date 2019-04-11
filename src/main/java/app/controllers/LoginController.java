package app.controllers;

import app.dtos.UserDTO;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *登录控制模块
 */
@Controller
@RequestMapping(path = "/users")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = "")
    public UserDTO getUserInfo(){
        System.out.println(loginService.getUserInfo().toString());
        return loginService.getUserInfo();
    }
}
