package app.services;

import app.dtos.UserDTO;

public interface LoginService {

    UserDTO LoginService(UserDTO userDTO);

    UserDTO getUserInfo();
}
