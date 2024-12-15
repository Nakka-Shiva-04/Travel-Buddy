package com.travelbuddy.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DriverDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id=0;
	private String driverName;
	private int age;
	private long phoneNumber;
	private String emailId;
	private String address;
	private int experience;
	public DriverDetails() {
		super();
	}
	public DriverDetails(int id, String driverName, int age, long phoneNumber, String emailId, String address,
			int experience) {
		super();
		id = id+1;
		this.driverName = driverName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.experience = experience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}