package app.services.servicesImpl;

import app.dtos.PromptMsgDto;
import app.repos.LoginRepo;
import app.repos.UserRepo;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public PromptMsgDto Login(String email, String password) {
        PromptMsgDto promptMsg =new PromptMsgDto();
        if(loginRepo.login(email, password).size() == 0){
            promptMsg.setMsgContent("账号或密码输入错误，请检查后重新输入！");
            promptMsg.setCode(4);
        }else{
            promptMsg.setMsgContent("验证通过");
            promptMsg.setCode(2);
            promptMsg.setOb(userRepo.findByEmail(email));
        }
        return promptMsg;
    }

}
