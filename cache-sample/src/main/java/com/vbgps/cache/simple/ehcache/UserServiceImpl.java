package com.vbgps.cache.simple.ehcache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserService userService;

	public UserInfo findById(Integer userId) {
		System.out.println("load user from db,cache key=" + userId);
		UserInfo user = new UserInfo();
		user.setUserId(1);
		user.setUserName("yebing");
		return user;
	}

	public List<UserInfo> findByIds(Integer... userIds) {
		return null;
	}

	public UserInfo findByUser(UserInfo user2) {
		System.out.println("findByUser from db,cache key obj user=" + user2.getUserId());
		return userService.findById(1);
	}

}
