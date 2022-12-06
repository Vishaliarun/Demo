package com.session.array;

import java.util.Arrays;

public class Employee {
	private int empID;
	private String empName;
	private Address[] addresses = new Address[3];
	
	
	
	public Employee(int empID, String empName, Address[] addresses) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.addresses = addresses;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", addresses=" + Arrays.toString(addresses) + "]";
	}
	
	
	
}

