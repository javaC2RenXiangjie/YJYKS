package app.converts;

import app.dtos.UserDTO;
import app.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserConvert {
    /**
     * userDTO  =>userEntity
     * @param userDTO
     * @return
     */
    public UserEntity userDtoToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setPwd(userDTO.getPwd());
        userEntity.setGender(userDTO.getGender());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setIdCard(userDTO.getIdCard());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setFace(userDTO.getFace());
        userEntity.setArea(userDTO.getArea());
        userEntity.setIdStatus(userDTO.getIdStatus());
        userEntity.setAddTime(userDTO.getAddTime());
        userEntity.setAuthority(userDTO.getAuthority());
        return userEntity;
    }

    /**
     * userEntity => userDTO
     * @param userEntity
     * @return
     */
    public UserDTO userEntityToDto(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setName(userEntity.getName());
        userDTO.setPwd(userEntity.getPwd());
        userDTO.setGender(userEntity.getGender());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setIdCard(userEntity.getIdCard());
        userDTO.setPhone(userEntity.getPhone());
        userDTO.setFace(userEntity.getFace());
        userDTO.setArea(userEntity.getArea());
        userDTO.setIdStatus(userEntity.getIdStatus());
        userDTO.setAddTime(userEntity.getAddTime());
        userDTO.setAuthority(userEntity.getAuthority());
        return userDTO;
    }
}
