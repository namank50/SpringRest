package com.example.ninth.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	Integer eid;
	String fname;
	String lname;
	String street;
	String city;
	String state;
	String zip;
	String country;

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Customer(Integer eid, String fname, String lname, String street, String city, String state, String zip,
			String country) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}




	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
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


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Customer [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", street=" + street + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

	

}
