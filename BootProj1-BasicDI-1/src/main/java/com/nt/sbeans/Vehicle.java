
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("eEngine")// perform byName mode of Autowiring
private IEngine engine;
	
	
	public Vehicle() {
		System.out.println("Vehicle::0-Param constructor()");
	}
	// b. method
	public void journey(String startPlace,String destPlace) {
		engine.start();
		System.out.println("Journey is started::"+destPlace);
		System.out.println("Journey is going....on::"+startPlace);
		System.out.println("Journey is going.... on");
		engine.stop();
		System.out.println("Journey is stopped at::"+destPlace);
	}
	}

