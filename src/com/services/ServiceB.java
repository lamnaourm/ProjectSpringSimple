package com.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceB implements IService {

	@Override
	public void display() {
		System.out.println("Service B");

	}

}
