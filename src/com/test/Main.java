package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.client.IClient;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
		app.scan("com");
		
		app.refresh();


		IClient c = (IClient) app.getBean("clientA");

		c.display();


	}

}
