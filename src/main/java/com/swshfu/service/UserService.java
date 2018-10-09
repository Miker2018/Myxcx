package com.swshfu.service;

import java.util.List;

import com.swshfu.po.User;

public interface UserService {
	//根据用户id查询用户信息
		public User findUserById(int id);
		//查询用户列表
		public List<User> findUserByUsername(String username);
		//添加用户信息
		public void insertUser(User user); 
}
