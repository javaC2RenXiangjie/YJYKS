package app.services;

import app.dtos.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {

    UserDTO LoginService(UserDTO userDTO);

    List<UserDTO> getUserInfo();
}
