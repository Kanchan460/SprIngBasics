package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.cantroller.PayrollOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppApplication.class, args);
		PayrollOperationController controller=ctx.getBean("payroll", PayrollOperationController.class);
		try {
			List<Employee> list=controller.showEmployeesByDesg("ANALYST","MANAGER","SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
			
		
	}
catch(Exception e) {
	e.printStackTrace();
	System.err.println("Internal problem- try again::"+e.getMessage());
}
		((ConfigurableApplicationContext)ctx).close();
}
}