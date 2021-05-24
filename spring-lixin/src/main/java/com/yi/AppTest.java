package com.yi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(AppService.class));
	}
}
