package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<TUser> queryAll() {
        return userDao.queryAll();
    }

}
