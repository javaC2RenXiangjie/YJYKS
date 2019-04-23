package app.services;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {
    PromptMsgDto register(UserDTO userDTO);
}
