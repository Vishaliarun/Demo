package com.session.array;

public class Address {
	private String city;
	private String state;
	private int zipcode;
	private String Country;

	public Address(String city, String state, int zipcode, String country) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		Country = country;
	}

	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", Country=" + Country + "]";
	}
	
	
}
