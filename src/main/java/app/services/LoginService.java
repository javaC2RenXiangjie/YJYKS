package app.services;

import app.dtos.PromptMsg;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    PromptMsg Login(String account, String password);
}
