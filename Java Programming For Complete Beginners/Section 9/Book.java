package com.OOPinJava;

public class Book {
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void incCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}

	void decCopies(int howMuch) {
		if (this.noOfCopies - howMuch > 0) {
			this.noOfCopies -= howMuch;
		}

	}
}
