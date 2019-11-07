package com.xpf.coffee.service;

import com.xpf.coffee.entity.User;

public interface UserService {
    /**
     * 注册用户--向数据库中添加用户
     * @param user 用户对象
     * @throws Exception
     */
    void registerUser(User user) throws Exception;

    /**
     * 用户登录--
     * 查询用户是否在数据库中，
     * 判断用户账号，密码与级别是否正确
     * @param user 用户对象
     * @return 用户对象
     * @throws Exception
     */
    User loginUser(User user)throws Exception;
}
