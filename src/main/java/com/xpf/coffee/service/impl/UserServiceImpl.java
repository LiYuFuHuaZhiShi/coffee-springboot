package com.xpf.coffee.service.impl;

import com.xpf.coffee.dao.UserMapper;
import com.xpf.coffee.entity.User;
import com.xpf.coffee.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void registerUser(User user) throws Exception {
        userMapper.insertUser(user);
        System.out.println("用户"+user.getUserName()+"注册成功");
    }

    @Override
    public User loginUser(User user) throws Exception {
        User u = userMapper.findUser(user);
        if (u!=null)
            return u ;
        return null;
    }
    
    public List<User> findUserList(String likeName) throws Exception{
    	return userMapper.findUserList(likeName);
    }
    
}
