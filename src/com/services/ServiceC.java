package com.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceC implements IService {

	@Override
	public void display() {
		System.out.println("Service C");

	}

}
