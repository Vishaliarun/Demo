package com.session.array;

public class MainOfCompany {
	public static void main(String[] args) {
			
		Address[] addresses = new Address[3];
		addresses[0] = new Address("Herndon","VA",20171,"USA");
		addresses[1] = new Address("Herndon","VA",20171,"USA");
		addresses[2] = new Address("Cbe","TN",643219,"INDIA");
		
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(23,"visha",addresses);
		emp[1] = new Employee(24,"arun",addresses);
		emp[2] = new Employee(25,"ashok",addresses);
		
		Company[] cmp = new Company[1];
		cmp[0] = new Company("ABC", 5, 2000,emp);
		
		for(Company i:cmp) {
			System.out.println(i);
		}
	}
}
