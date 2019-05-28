package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

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
     * @param account
     * @return
     */
    @PostMapping(value = "/delete/{account}")
    public PromptMsgDto delUserByAccount(@PathVariable(name = "account") String account){
        return userService.delUserByAccount(account);
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


     @Bean
     public MultipartResolver multipartResolver() {
         CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
         multipartResolver.setMaxUploadSize(1000000);
         return multipartResolver;
     }

    @PostMapping(value = "/imgPost")
    public PromptMsgDto saveFaceImg(@RequestParam MultipartFile imgFile)throws Exception{
        System.out.println(imgFile);
        return userService.saveFaceImg(imgFile);
    }

}
