package com.xpf.coffee.web.listener;

import com.xpf.coffee.entity.User;
import com.xpf.coffee.util.UserList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class UserListener implements HttpSessionAttributeListener {

    /**
     * 重写监听器的add方法
     * --当在session中添加内容时会调用此方法，
     * 得到添加内容，若此内容是User的实例就添加到UserList内，
     * 在后台返回UserList内的数目--登录用户数目
     */
    public void attributeAdded(HttpSessionBindingEvent e){
        if (e.getValue() instanceof User)
            UserList.add((User) e.getValue());
        System.out.println("在线人数"+UserList.getInstance().getList().size());
    }

    /**
     * 重写监听器的remove方法
     *  --当在session中去除内容时会调用此方法，
     *  得到去除内容，若此内容是User的实例就去除UserList此内容，
     *  在后台返回UserList内的数目--登录用户数目
     */
    public void attributeRemoved(HttpSessionBindingEvent e){
        if (e.getValue() instanceof User)
            UserList.remove((User)e.getValue());

        System.out.println("在线人数"+UserList.getInstance().getList().size());
    }


}
