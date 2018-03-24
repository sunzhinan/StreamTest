package com.sun.myl.dao;

import org.apache.ibatis.annotations.Param;

import com.sun.myl.entity.User;

public interface UserMapper {
	User select(@Param("name") String name);

	int userNameExits(@Param("name") String name);

	int accountValid(User user);

	int insert(User user);
	
}
