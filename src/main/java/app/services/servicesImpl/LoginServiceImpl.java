package app.services.servicesImpl;

import app.dtos.PromptMsg;
import app.repos.LoginRepo;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Override
    public PromptMsg Login(String account, String password) {
        PromptMsg promptMsg =new PromptMsg();
        if(loginRepo.login(account, password).size() == 0){
            promptMsg.setMsgContent("账号或密码输入错误，请检查后重新输入！");
        }else{
            promptMsg.setMsgContent("验证通过");
        }
        return promptMsg;
    }

}
