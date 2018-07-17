package com.vbgps.cache.simple.ehcache;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		final AbstractApplicationContext  factory = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		UserService userService = factory.getBean(UserService.class);
		UserInfo user = userService.findById(22);
		System.out.println(user.getUserName());
		UserInfo user2 = userService.findById(22);
		System.out.println(user2.getUserName());
		UserInfo user3 = userService.findByUser(user2);
		System.out.println(user3.getUserName());
		UserInfo userInfo=new UserInfo();
		userInfo.setUserId(1);
		UserInfo user4 = userService.findByUser(userInfo);
		System.out.println(user4.getUserName());
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

			public void run() {
				System.out.println("应用关闭");
				factory.close();
			}
		}));
	}

}
