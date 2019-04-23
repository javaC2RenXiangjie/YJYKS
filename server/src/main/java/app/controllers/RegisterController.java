package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    /**
     * 注册账号
     * @param userDTO
     * @return
     */
    @PostMapping(value = "")
    public PromptMsgDto register(@RequestBody UserDTO userDTO){
        return registerService.register(userDTO);
    }
}
