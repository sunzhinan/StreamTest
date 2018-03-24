package com.sun.myl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.myl.entity.User;
import com.sun.myl.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-mybatis.xml" })
public class TestUserMapper {
	@Autowired
	UserService userService;

	@Test
	public void testAdd() {
		User user = new User();
		user.setUserId("201801281523432349875");
		user.setUserName("sunzhinan");
		user.setUserPassword("Szn234*");
		int res = userService.insert(user);
		System.out.println(res);
	}

}
