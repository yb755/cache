package com.vbgps.cache.simple.ehcache;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

public interface UserService {

	@Cacheable(value = "user-info")
	UserInfo findById(Integer userId);

	@Cacheable(value = "")
	List<UserInfo> findByIds(Integer... userIds);

	@Cacheable(value = "user-info")
	UserInfo findByUser(UserInfo user);
}
