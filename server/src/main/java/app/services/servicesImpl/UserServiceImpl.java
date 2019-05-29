package app.services.servicesImpl;

import app.utils.ImgUtils;
import app.converts.UserConvert;
import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.entities.UserEntity;
import app.repos.UserRepo;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConvert userConvert;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ImgUtils imgUtils;

    @Override
    public List<UserDTO> getUserInfo() {
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserEntity userEntity:userRepo.getUserInfo()) {
            userDTOS.add(userConvert.userEntityToDto(userEntity));
        }
        return userDTOS;
    }

    @Override
    public PromptMsgDto delUserByAccount(String account) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        userRepo.delete(userRepo.findByAccount(account));
        promptMsgDto.setMsgContent("删除成功~");
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto updateUser(UserDTO userDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        userRepo.save(userConvert.userDtoToEntity(userDTO));
        promptMsgDto.setMsgContent("更改成功~");
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto saveFaceImg(MultipartFile imgFile, String imgName) {

        PromptMsgDto promptMsgDto = new PromptMsgDto();

        if(imgUtils.saveImg(imgFile, imgName)){
            promptMsgDto.setMsgContent("图片保存成功！");
            return promptMsgDto;
        }else {
            promptMsgDto.setMsgContent("图片保存失败！");
            return promptMsgDto;
        }
    }
}
