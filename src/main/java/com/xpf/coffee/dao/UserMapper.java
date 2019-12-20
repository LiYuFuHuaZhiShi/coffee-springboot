package com.xpf.coffee.dao;

import java.util.List;

import com.xpf.coffee.entity.User;

public interface UserMapper {
    /**
     * 向数据库中添加用户
     * @param user 用户对象
     */
    void insertUser(User user);

    /**
     * 在数据库中查询用户，
     * 并判断用户账号，密码，级别
     * @param user 用户对象
     */
    User findUser(User user);
    
    List<User> findUserList(String likeName);
}
