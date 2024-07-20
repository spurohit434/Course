package com.OOPinJava;

public class BookRunner {
	public static void main(String[] args) {
		Book art_of_CP = new Book();
		Book clean_code = new Book();

		art_of_CP.incCopies(35);
		int copies = art_of_CP.getNoOfCopies();
		System.out.println(copies);
		clean_code.decCopies(50);

	}
}
