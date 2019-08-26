package com.rhine.studySSM.dao;

import org.springframework.stereotype.Repository;
import com.rhine.studySSM.entity.User;

import java.util.List;

@Repository
public interface UserDao {

	User userlogin(User user);

	List<User> selectAll();

	public User findUsersByUsername(String username);

	public int addUser(User user);

	public int modifyPasswordByUsername(User user);

    int save(User user);
    /**
     * 查找一个用户对象，根据用户名
     * @param username 用户名
     * @return 查找到的用户对象
     */
    User findByUsername(String username);

    /**
     * 查找一个用户对象，根据主键id
     * @param id 主键
     * @return 查找到的用户对象
     */
    User findById(Integer id);

}
