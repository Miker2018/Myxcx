package com.swshfu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.swshfu.mapper.UserMapper;
import com.swshfu.po.User;
import com.swshfu.service.UserService;

/**
 * 用户管理service
 * @author yanzhou
 *
 */

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserById(int id) {
		User user = userMapper.findUserById(id);
		return user;
	}

	@Override
	public List<User> findUserByUsername(String username) {
		List<User> userList = userMapper.findUserByUsername(username);
		return userList;
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

}
