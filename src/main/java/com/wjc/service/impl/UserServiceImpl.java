package com.wjc.service.impl;

import com.wjc.dao.UserDao;
import com.wjc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String findPasswordByID(int id) {
        return userDao.findPasswordByID(id);
    }

    @Override
    public boolean addNewUser(String username, String password, int id) {
        return userDao.addNewUser(username, password, id);
    }


}
