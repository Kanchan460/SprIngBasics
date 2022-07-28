package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class Electric implements IEngine {

	
	@Override
	public void start() {
		System.out.println("ElectricEngine::started");

	}

	@Override
	public void stop() {
	System.out.println("ElectricEngine::stopped()");

	}

}
