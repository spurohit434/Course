package com.OOP2again;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("lin141", "Noida", "201305");
		Customer c1 = new Customer("Kapil", homeAddress);
		Address workAddress = new Address("Advant142", "Noida", "201305");
		System.out.println(c1);

		c1.setWorkAddress(workAddress);
		System.out.println(c1.toString());
	}
}
