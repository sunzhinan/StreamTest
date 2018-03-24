package com.sun.myl.service;

import com.sun.myl.entity.User;

public interface UserService {
	User select(String name);

	int userNameExits(String name);

	boolean accountValid(User user);

	int insert(User user);
}
