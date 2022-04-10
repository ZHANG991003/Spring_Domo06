package com.itheima.dao.Impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public boolean login(String username, String password) {

        if ("张三".equals(username)&&"123".equals(password)){
            return true;
        }else {
            return false;
        }


    }
}
