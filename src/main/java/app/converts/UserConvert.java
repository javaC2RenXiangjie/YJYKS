package app.converts;

import app.dtos.UserDTO;
import app.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserConvert {
    public UserEntity userDtoToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setRealName(userDTO.getRealName());
        userEntity.setAccount(userDTO.getAccount());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setEmail(userDTO.getEmail());
        return userEntity;
    }

    public UserDTO userEntityToDto(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setRealName(userEntity.getRealName());
        userDTO.setAccount(userEntity.getAccount());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setEmail(userEntity.getEmail());
        return userDTO;
    }
}
