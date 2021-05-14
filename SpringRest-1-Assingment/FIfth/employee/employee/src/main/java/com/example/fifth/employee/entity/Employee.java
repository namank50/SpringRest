package com.example.fifth.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	Integer eid;
	String ename;
	String edept;
	String eDesignation;
	long eSalary;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String employeeName, String employeeDepartment, String employeeDesignation,
			long employeeSalary) {
		super();
		this.eid = employeeId;
		this.ename = employeeName;
		this.edept = employeeDepartment;
		this.eDesignation = employeeDesignation;
		this.eSalary = employeeSalary;
	}

	public Integer getEmployeeId() {
		return eid;
	}

	public void setEmployeeId(Integer employeeId) {
		this.eid = employeeId;
	}

	public String getEmployeeName() {
		return ename;
	}

	public void setEmployeeName(String employeeName) {
		this.ename = employeeName;
	}

	public String getEmployeeDepartment() {
		return edept;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.edept = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return eDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.eDesignation = employeeDesignation;
	}

	public long getEmployeeSalary() {
		return eSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.eSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + eid + ", employeeName=" + ename + ", employeeDepartment=" + edept
				+ ", employeeDesignation=" + eDesignation + ", employeeSalary=" + eSalary + "]";
	}

}
