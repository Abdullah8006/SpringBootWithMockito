package com.abd.io.Springbootwithtesting.entity;

public class Business {

	private String name;
	private String address;
	private long tinNumber;

	public Business(String name, String address, long tinNumber) {
		super();
		this.name = name;
		this.address = address;
		this.tinNumber = tinNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(long tinNumber) {
		this.tinNumber = tinNumber;
	}

}
