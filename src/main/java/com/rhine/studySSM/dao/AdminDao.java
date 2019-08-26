package com.rhine.studySSM.dao;

import com.rhine.studySSM.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/25 14:59
 */
@Repository
public interface AdminDao {

    Admin login(Admin admin);

    int save(Admin admin);

    int delete(Integer id);

    int update(Admin admin);

    Admin findByEmpNum(String empNum);

    Admin findById(Integer id);

    Admin findByUsername(String username);

    List<Admin> listAll();
}
