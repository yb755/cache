package com.vbgps.cache.simple.ehcache;

import java.util.List;

public interface UserService {

	UserInfo findById(Integer userId);

	List<UserInfo> findByIds(Integer... userIds);

	UserInfo findByUser(UserInfo user);
}
