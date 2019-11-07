package com.xpf.coffee.web.controller;

import com.xpf.coffee.entity.User;
import com.xpf.coffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param user 用户对象
     * @return 重定向到主页
     * @throws Exception
     */
    @RequestMapping(value = "user/register")
    public String Register(User user) throws Exception {
        userService.registerUser(user);
        return "redirect:/index";
    }

    /**
     * 用户登录
     * @param user 用户对象
     * @return 重定向到 主页
     * @throws Exception
     */
    @RequestMapping(value = "user/login")
    public String Login(User user, HttpSession session) throws Exception{
        User u = userService.loginUser(user);
        if (u!=null){
            session.setAttribute("user",user);
            return "redirect:/index";
        }
        return "redirect:/index";
    }


    /**
     * 用户登出
     * @param session
     * @return 重定向到主页
     */
    @RequestMapping(value = "/user/logout")
    public String logout(HttpSession session) {
        //清除session
        session.invalidate();
        //重定向到登陆界面的跳转方法
        return "redirect:/index";
    }
}
