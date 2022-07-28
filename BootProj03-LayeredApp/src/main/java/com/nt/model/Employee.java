package com.nt.model;



import lombok.Data;

@Data
public class Employee {
private Integer eno;
private String ename;
private String desg;
private Double salary;
private Integer deptno;

@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + ", deptno=" + deptno
			+ "]";
}


}
