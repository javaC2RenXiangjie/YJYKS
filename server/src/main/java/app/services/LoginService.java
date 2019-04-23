package app.services;

import app.dtos.PromptMsgDto;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    PromptMsgDto Login(String account, String password);
}
