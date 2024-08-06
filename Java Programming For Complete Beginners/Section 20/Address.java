package com.OOP2again;

public class Address {
	private String line1;
	private String city;
	private String zipNo;

	public Address(String line1, String city, String zipNo) {
		this.line1 = line1;
		this.city = city;
		this.zipNo = zipNo;
	}

	@Override
	public String toString() {
		return String.format("line1 - %s, city - %s, zipNo - %s", line1, city, zipNo);
	}
}
