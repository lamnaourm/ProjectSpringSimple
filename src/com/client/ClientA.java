package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.IService;
import com.services.ServiceA;


@Service
public class ClientA implements IClient {
	
	@Autowired
	IService serviceC;

	@Override
	public void display() {
		serviceC.display();

	}

}
