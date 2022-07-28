package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class Diesel implements IEngine {

	public Diesel() {
		System.out.println("Diesel:: 0-param constructor()");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine::started");

	}

	@Override
	public void stop() {
	System.out.println("DieselEngine::stopped()");

	}

}
