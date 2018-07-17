package com.vbgps.cache.simple.ehcache;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	public UserInfo findById(Integer userId) {
		System.out.println("load user from db");
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUserName("yebing");
		return user;
	}

	public List<UserInfo> findByIds(Integer... userIds) {
		System.out.println("load user list from db");
		return null;
	}

	public UserInfo findByUser(UserInfo user) {
		System.out.println("load user from db");
		UserInfo userdb = new UserInfo();
		userdb.setUserName("findByUser");
		return userdb;
	}

}
