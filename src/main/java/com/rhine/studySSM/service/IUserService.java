package com.rhine.studySSM.service;

import com.rhine.studySSM.entity.User;

import java.util.List;

public interface IUserService {

	User userlogin(User user);

	public List<User> getAll();

	void register(User user);

	User getUserById(Integer id);

	User findByUsername(String username);
}
