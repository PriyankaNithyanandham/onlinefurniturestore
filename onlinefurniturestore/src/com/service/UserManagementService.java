package com.service;

import com.entity.User;

public interface UserManagementService {
	boolean loginUser(String username,String password);
	User registerNewUser(User user);
	User updateUser(User user);
	String deleteUser(User user);
	String deleteUserById(int uid);
}
