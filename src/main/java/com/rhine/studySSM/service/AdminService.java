package com.rhine.studySSM.service;

import com.rhine.studySSM.entity.Admin;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/25 15:00
 */
public interface AdminService {

    void register(Admin admin);

    void delete(Integer id);

    Admin login(Admin admin);

    void updatePassword(Admin admin);

    Admin getById(Integer id);

    Admin findByUsername(String username);

    List<Admin> listAll();
}
