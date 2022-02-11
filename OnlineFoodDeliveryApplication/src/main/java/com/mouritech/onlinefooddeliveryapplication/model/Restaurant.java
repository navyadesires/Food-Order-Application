/*package com.mouritech.onlinefooddeliveryapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "restaurantId", nullable = false)
	private Long customerId;
	
	@Column(name="restaurantName", nullable = false)
	private String firstName;
	
	@Column(name = "address", nullable = false)
	private String lastName;
	
	@Column(name = "itemlist", nullable = false)
	private int age;
	
	@Column(name = "managerName", nullable = false)
	private String email;
	
	@Column(name = "ContactName")
	private String password1;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "mobileNumber", nullable = false)
	private String mobileNumber;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "pincode", nullable = false)
	private String pincode;
	
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, int age, String email, String password, String mobileNumber, String address,
			String city, String state, String country, String pincode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password1=password;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Customer(String firstName, String lastName, int age, String email, String password, String gender, String mobileNumber,
			String address, String city, String state, String country, String pincode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password1=password;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return email;
	}

	public void setPassword(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", email=" + email + ",password=" + password1 + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", address="
				+ address + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ "]";
	}

} */