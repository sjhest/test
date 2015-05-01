package com.sjh.dao;

import java.util.List;

import com.sjh.entities.User;

public interface UserDao {

	public String getUserNameById(int id);
	public void saveUser(User user);
	
	
}
