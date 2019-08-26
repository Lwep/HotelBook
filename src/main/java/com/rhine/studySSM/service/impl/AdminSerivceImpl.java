package com.rhine.studySSM.service.impl;

import com.rhine.studySSM.dao.AdminDao;
import com.rhine.studySSM.entity.Admin;
import com.rhine.studySSM.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/25 15:01
 */
@Service
public class AdminSerivceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public void register(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public void delete(Integer id) {
        adminDao.delete(id);
    }

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

    @Override
    public void updatePassword(Admin admin) {
        adminDao.update(admin);
    }

    @Override
    public Admin getById(Integer id) {
        return adminDao.findById(id);
    }

    @Override
    public List<Admin> listAll() {
        return adminDao.listAll();
    }


    @Override
    public Admin findByUsername(String username) {
        if (!StringUtils.isEmpty(username)) {
            return adminDao.findByUsername(username);
        }
        return null;
    }
}
