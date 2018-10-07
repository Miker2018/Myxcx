package com.swshfu.dao;

import java.util.List;

import com.swshfu.po.User;

public interface userDao {
	
	User getUserById(int id);
	List<User> getUserByName(String username);
	void insertUser(User user);
}
