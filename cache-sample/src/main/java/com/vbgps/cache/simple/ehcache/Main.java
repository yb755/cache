package com.vbgps.cache.simple.ehcache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		UserService userService = factory.getBean(UserService.class);
		UserInfo user = userService.findById(22);
		System.out.println(user.getUserName());
		UserInfo user2 = userService.findById(22);
		System.out.println(user2.getUserName());
	}

}
