package app.services.servicesImpl;

import app.dtos.SaveFileMsgDto;
import app.entities.FileEntity;
import app.repos.FileRepo;
import app.utils.ImgUtils;
import app.converts.UserConvert;
import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.entities.UserEntity;
import app.repos.UserRepo;
import app.services.UserService;
import app.utils.VideoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConvert userConvert;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private FileRepo fileRepo;

    @Autowired
    private ImgUtils imgUtils;

    @Autowired
    private VideoUtils videoUtils;

    @Override
    public List<UserDTO> getUserInfo() {
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserEntity userEntity:userRepo.getUserInfo()) {
            userDTOS.add(userConvert.userEntityToDto(userEntity));
        }
        return userDTOS;
    }

    @Override
    public PromptMsgDto delUserByEmail(String email) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        userRepo.delete(userRepo.findByEmail(email));
        promptMsgDto.setMsgContent("删除成功~");
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto updateUser(UserDTO userDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        userRepo.save(userConvert.userDtoToEntity(userDTO));
        promptMsgDto.setMsgContent("更改成功~");
        promptMsgDto.setCode(2);
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto saveFile(MultipartFile file, String videoName) {
        SaveFileMsgDto saveFileMsgDto = videoUtils.saveVideo(file, videoName);
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        FileEntity fileEntity = new FileEntity();
        fileEntity.setTitle(videoName);
        fileEntity.setImg("imgSrc");
        fileEntity.setViewNum(0);
        fileEntity.setAdminId(1);
        fileEntity.setNewstagId(1);
        fileEntity.setRemark("视频简介");
        if(saveFileMsgDto.isSuccessedOrNot()){
            fileEntity.setContent(saveFileMsgDto.getFileName());
            fileEntity.setAddTime(new Date());
            fileRepo.save(fileEntity);
            promptMsgDto.setMsgContent("文件保存成功！");
            return promptMsgDto;
        }else {
            promptMsgDto.setMsgContent("文件保存失败！");
            return promptMsgDto;
        }
    }
}
