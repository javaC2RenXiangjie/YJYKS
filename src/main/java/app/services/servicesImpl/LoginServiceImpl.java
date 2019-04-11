package app.services.servicesImpl;

import app.converts.UserConvert;
import app.dtos.UserDTO;
import app.entities.UserEntity;
import app.repos.LoginRepo;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserConvert userConvert;

    @Autowired
    LoginRepo loginRepo;

    @Override
    public UserDTO LoginService(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO getUserInfo() {
        return userConvert.userEntityToDto(loginRepo.getUserInfo());
    }
}
