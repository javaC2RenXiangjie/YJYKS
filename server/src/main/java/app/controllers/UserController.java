package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

 /**
 *登录控制模块
 */
@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 得到所有用户信息
     * @return
     */
    @GetMapping(value = "")
    public List<UserDTO> getUserInfo(){
        return userService.getUserInfo();
    }

    /**
     * 删除用户
     * @param email
     * @return
     */
    @PostMapping(value = "/delete/{email}")
    public PromptMsgDto delUserByEmail(@PathVariable(name = "email") String email){
        return userService.delUserByEmail(email);
    }

    /**
     * 更改数据
     * @param userDTO
     * @return
     */
    @PostMapping(value = "/update")
    public PromptMsgDto updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }


//     @Bean
//     public MultipartResolver multipartResolver() {
//         CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//         multipartResolver.setMaxUploadSize(3000000);
//         return multipartResolver;
//     }

     @PostMapping(value = "/imgPost")
     public PromptMsgDto saveFile(@RequestBody MultipartFile file)throws Exception {
         return userService.saveFile(file, file.getOriginalFilename());
     }

//     @PostMapping(value = "/imgPost")
//     public PromptMsgDto saveFaceImg( CommonsMultipartResolver imgFile, HttpServletRequest httpServletRequest)throws Exception {
//         System.out.println(imgFile.resolveMultipart(httpServletRequest).getFileMap());
////         return userService.saveFaceImg(imgFile, imgFile.getOriginalFilename());
//         return null;
//     }
}
