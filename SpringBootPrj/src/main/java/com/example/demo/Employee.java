package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String sname;
	private int Salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", sname=" + sname + ", Salary=" + Salary + "]";
	}
	
	
}
