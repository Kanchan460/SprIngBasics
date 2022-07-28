package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj1BasicDi1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj1BasicDi1Application.class, args);
		// get target class  obj ref
		
		 Vehicle vehicle=ctx.getBean("Vehicle",Vehicle.class);
		 // Invoke the b method
		 vehicle.journey("hyd", "delhi");
	( (ConfigurableApplicationContext) ctx).close();
	}

}
