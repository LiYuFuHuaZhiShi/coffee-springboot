package com.xpf.coffee;

import com.xpf.coffee.entity.User;
import com.xpf.coffee.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void UserLogin() throws Exception {
        User user = new User("Tom","123",1);
        User u = userService.loginUser(user);
        System.out.println(u);
    }
    
    @Test
    public void UserRegister() throws Exception {
    	User user = new User("KS","123","12345689888","5123@123.com",1);
    	userService.registerUser(user);
    }

}
