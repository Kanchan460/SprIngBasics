package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class Petrol implements IEngine {
public Petrol() {
	
	System.out.println("Petrol::0-param constructor()");
}
	
	@Override
	public void start() {
		System.out.println("PetrolEngine::started");

	}

	@Override
	public void stop() {
	System.out.println("PetrolEngine::stopped()");

	}

}
