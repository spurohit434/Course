package com.OOP2again;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return id + " " + description + " " + rating;
	}

}
