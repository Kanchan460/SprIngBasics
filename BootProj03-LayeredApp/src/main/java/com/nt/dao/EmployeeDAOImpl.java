package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private DataSource ds;

	private ArrayList list;

	private Object emp;

	private static final String GET_EMPLOYEE_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP  WHERE JOB IN(?,?,?) ORDER BY SAL";

	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println(ds.getClass().getName());
		List<Employee> empList = null;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPLOYEE_BY_DESG)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery()) {
				
				list = new ArrayList();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setEno(rs.getInt(1));
					employee.setEname(rs.getString(2));
					employee.setDesg(desg3);
					employee.setSalary(rs.getDouble(4));
					employee.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			} // try2
		} // try1
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} // catch 2
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return list;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImpl [ds=" + ds + ", list=" + list + ", emp=" + emp + "]";
	}
}
