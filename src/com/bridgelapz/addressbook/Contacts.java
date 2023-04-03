package com.bridgelapz.addressbook;

public class Contacts {

	private String firstNames;
	private String lastNames;
	private String address;
	private String city;
	private String state;
	private long zip;
	private long phone;
	private String email;

	Contacts(){
	
	}
	
	
	public Contacts(String firstNames, String lastNames, String address, String city, String state, long zip,
			long phone, String email) {
		super();
		this.firstNames = firstNames;
		this.lastNames = lastNames;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}


	public String getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(String firstNames) {
		this.firstNames = firstNames;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
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

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

   public String toString() {
		return "Contacts [firstNames=" + firstNames + ", lastNames=" + lastNames + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
	}

}
