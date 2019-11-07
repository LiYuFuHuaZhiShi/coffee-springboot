package com.xpf.coffee.util;

import com.xpf.coffee.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 后台监听器实现在线人数--单例模式
 */
public class UserList {
    private UserList(){}//构造器私有
    private static List<User> list = new ArrayList<>();
    private static UserList instance = null;//首先创建一个instance

    /**
     * 双重检查锁实现单例模式计数器
     * @return 计数器类
     */
    public static UserList getInstance(){
        if (instance == null){
            UserList s ;
            synchronized (UserList.class){//调用双重锁，解决线程问题
                s = instance;
                if (s == null){
                    synchronized (UserList.class){
                        if (s == null){
                            s = new UserList();
                        }
                    }
                    instance = s;
                }
            }
        }
        return instance;
    }

    /**
     * 添加方法
     * @param user 用户对象
     */
    public static void add(User user){
        list.add(user);
    }

    /**
     * 移除方法
     * @param user 用户对象
     */
    public static void remove(User user){
        list.remove(user);
    }

    /**
     * 得到用户list方法
     * @return 用户list
     */
    public List<User> getList(){
        return list;
    }
}
