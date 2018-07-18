package com.vbgps.cache.simple.ehcache;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

public interface UserService {

	@Cacheable(value = "user-info")
	UserInfo findById(Integer userId);

	List<UserInfo> findByIds(Integer... userIds);

	UserInfo findByUser(UserInfo user);
}
