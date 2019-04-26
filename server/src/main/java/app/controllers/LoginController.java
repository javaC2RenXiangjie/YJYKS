package app.controllers;

import app.dtos.PromptMsgDto;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录验证
     * @param accPasStr
     * @return
     */
    @PostMapping(value = "/{accPasStr}")
    public PromptMsgDto login(@PathVariable(name = "accPasStr") String accPasStr) {
        System.out.println(accPasStr);
        String account = accPasStr.split("&")[0];
        String password = accPasStr.split("&")[1];
        return loginService.Login(account, password);
    }
}