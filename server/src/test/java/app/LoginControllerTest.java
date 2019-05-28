package app;

import app.controllers.LoginController;
import app.dtos.PromptMsgDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    /**
     * 登录接口测试
     */
    @Test
    public void loginTest() {
        //设置期盼的返回结果
        PromptMsgDto promptMsg =new PromptMsgDto();
        promptMsg.setMsgContent("验证通过");
        //接口返回与期盼结果做对比
        Assert.assertEquals(promptMsg.toString(),loginController.login(("1021031476@qq.com&123456")).toString());
    }
}
