package com.xpf.coffee.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xpf.coffee.entity.User;
import com.xpf.coffee.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * swagger接口测试类
 */
@Api(value = "用户操作")
@RestController
@RequestMapping("/userLog")
public class SwaggerLogin {
	@Autowired
    private UserService userService;
	
	@RequestMapping("/in")
	@ApiOperation(value = "用户登录")
	public void Login(@ApiParam(value = "输入用户名")@RequestParam(defaultValue = "", required = false) String username,
			@ApiParam(value = "输入用户密码")@RequestParam(defaultValue = "", required = false) String password,HttpSession session) throws Exception{
        System.out.println("用户名和密码是:"+username+"\t"+ password);
//        User u = userService.loginUser(user);
//        if (u!=null){
//            session.setAttribute("user",user);
//            return "redirect:/index";
//        }
//        return "redirect:/index";
    }
	
	
	@RequestMapping("/list")
	@ApiOperation(value = "用户列表")
	public void UserList(@ApiParam(value = "输入带搜索用户名")@RequestParam(defaultValue = "", required = false) String likeName) throws Exception {
		String likeNameDel = "%"+likeName+"%";
		List<User> uList = userService.findUserList(likeNameDel);
		for (User user : uList) {
			System.out.println(user);
		}
	}
	
}
