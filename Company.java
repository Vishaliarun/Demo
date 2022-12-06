package com.session.array;

import java.util.Arrays;

public class Company {
	private String companyName;
	private int rating;
	private int startyear;
	private Employee[] emp = new Employee[3];
	
	
	
	public Company(String companyName, int rating, int startyear, Employee[] emp) {
		super();
		this.companyName = companyName;
		this.rating = rating;
		this.startyear = startyear;
		this.emp = emp;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getStartyear() {
		return startyear;
	}
	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}
	
	public Employee[] getEmp() {
		return emp;
	}
	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", rating=" + rating + ", startyear=" + startyear + ", emp="
				+ Arrays.toString(emp) + "]";
	}

	
}