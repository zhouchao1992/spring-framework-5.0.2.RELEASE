package com.zc.demo.controller;

import com.zc.demo.UserInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
	public static void main(String[] args) {
		//基于类名获取类的实列
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserInfo.class);
		context.register(UserInfo.class);*/
		//将bean注册，注册完强制刷新才能获取该bean的实列
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(UserInfo.class);
		context.refresh();*/
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		UserInfo bean = context.getBean(UserInfo.class);
		bean.show();
	}
}
