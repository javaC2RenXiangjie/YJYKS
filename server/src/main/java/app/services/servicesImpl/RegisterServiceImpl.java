package app.services.servicesImpl;

import app.converts.UserConvert;
import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.repos.RegisterRepo;
import app.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    private RegisterRepo registerRepo;

    @Autowired
    private UserConvert userConvert;

    @Override
    public PromptMsgDto register(UserDTO userDTO) {
        PromptMsgDto promptMsg = new PromptMsgDto();
        if(userDTO.getAccount().length() >20 || userDTO.getAccount().length() == 0 ){
            promptMsg.setMsgContent("账号不符合要求");
            return promptMsg;
        }else if(userDTO.getPassword().length() >20 || userDTO.getPassword().length() == 0 ){
            promptMsg.setMsgContent("密码不符合要求");
            return promptMsg;
        }else if(userDTO.getRealName().length() >20 || userDTO.getRealName().length() == 0){
            promptMsg.setMsgContent("姓名不符合要求");
            return promptMsg;
        }else if(!userDTO.getEmail().matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")){
            promptMsg.setMsgContent("邮箱不符合要求");
            return promptMsg;
        }else{
            registerRepo.save(userConvert.userDtoToEntity(userDTO));
            promptMsg.setMsgContent("注册成功");
            return promptMsg;
        }
    }
}