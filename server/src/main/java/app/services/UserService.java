package app.services;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface UserService {

    List<UserDTO> getUserInfo();

    PromptMsgDto delUserByEmail(String email);

    PromptMsgDto updateUser(UserDTO userDTO);

    PromptMsgDto saveFile(MultipartFile file, String fileName);

}
