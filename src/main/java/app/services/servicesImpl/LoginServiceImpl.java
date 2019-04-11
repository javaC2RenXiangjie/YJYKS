package app.services.servicesImpl;

import app.converts.UserConvert;
import app.dtos.UserDTO;
import app.entities.UserEntity;
import app.repos.LoginRepo;
import app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserConvert userConvert;

    @Autowired
    private LoginRepo loginRepo;

    @Override
    public UserDTO LoginService(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserDTO> getUserInfo() {
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserEntity userEntity:loginRepo.getUserInfo()) {
            userDTOS.add(userConvert.userEntityToDto(userEntity));
        }
        return userDTOS;
    }
}
