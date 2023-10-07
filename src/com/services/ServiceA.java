package com.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceA implements IService {

	@Override
	public void display() {
		System.out.println("Service A");

	}

}
