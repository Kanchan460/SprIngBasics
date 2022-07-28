package com.nt.cantroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Server;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationController{
	@Autowired
	private IEmployeeMgmtService service;

	public List<Employee> showEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("PayrollOperationController.showEmployeesByDesg()");
		List<Employee> list = service.fetchEmployeeByDesg(desg1, desg2, desg3);
		return list;
	}
}
