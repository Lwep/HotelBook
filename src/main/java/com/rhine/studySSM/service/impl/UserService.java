package com.rhine.studySSM.service.impl;

import java.util.List;

import com.rhine.studySSM.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhine.studySSM.entity.User;

import com.rhine.studySSM.service.IUserService;
import org.springframework.util.StringUtils;


@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User userlogin(User user) {
        return userDao.userlogin(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.selectAll();
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    //判断用户是否存在
    public boolean isUserExist(String username) {
        if ( userDao.findUsersByUsername(username) == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public User getUserById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public User findByUsername(String username) {

            return userDao.findByUsername(username);
    }





}
