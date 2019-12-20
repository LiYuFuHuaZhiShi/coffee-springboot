package com.xpf.coffee.entity;

import java.io.Serializable;

/**
 * 用户对象
 */
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String userPwd;
    private String userPhone;
    private String userEmail;
    private Integer userLevel;

    public User(){}

    public User(String userName, String userPwd, Integer userLevel) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userLevel = userLevel;
    }

    public User(String userName, String userPwd, String userPhone, String userEmail, Integer userLevel) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userLevel = userLevel;
    }


    //    /**
//     * 静态内部类--单例模式（懒加载）
//     */
//    private static class SingletonUserInstance{
//        private static final User instance = new User();
//    }
//    private User() {
//    }
//    public static User getInstance(){
//        return SingletonUserInstance.instance;
//    }


    /**
     * geter&seter
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userLevel=" + userLevel +
                '}';
    }
}
