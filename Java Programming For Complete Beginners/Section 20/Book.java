package com.OOP2again;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		// TODO Auto-generated method stub
		this.reviews.add(review); // using the .add() method of the ArrayList class
	}

	@Override
	public String toString() {
		return String.format("id - %d, Name - %s, author - %s, reviews - [%s]", id, name, author, reviews);
	}

}
