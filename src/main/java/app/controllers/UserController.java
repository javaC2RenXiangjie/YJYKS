package app.controllers;

import app.dtos.UserDTO;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *登录控制模块
 */
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private LoginService loginService;

    /**
     * 得到所有用户信息
     * @return
     */
    @GetMapping(value = "")
    public List<UserDTO> getUserInfo(){
        System.out.println(loginService.getUserInfo().toString());
        return loginService.getUserInfo();
    }
}
