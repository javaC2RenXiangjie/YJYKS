package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *登录控制模块
 */
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 得到所有用户信息
     * @return
     */
    @GetMapping(value = "")
    public List<UserDTO> getUserInfo(){
        return userService.getUserInfo();
    }

    @PostMapping(value = "/del/{account}")
    public PromptMsgDto delUserByAccount(@PathVariable(name = "account") String account){
        return userService.delUserByAccount(account);
    }

    @PostMapping(value = "/update")
    public PromptMsgDto updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

}
