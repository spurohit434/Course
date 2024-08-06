package com.OOP2again;

public class BookRunner {
	public static void main(String[] args) {
		// book -> id, description, author
		Book b1 = new Book(123, "OOP with Java", "Ramnam");
		b1.addReview(new Review(10, "Greatbook", 5)); // review -> id,descriptipn, rating
		b1.addReview(new Review(9, "Nice", 4));
		System.out.println(b1);
	}
}
