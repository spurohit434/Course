package com.primitive.datatypes;

public class BiNumber {
	private int num1, num2;

	BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		// TODO Auto-generated method stub
		return this.num1 + this.num2;
	}

	public int multiply() {
		// TODO Auto-generated method stub
		return this.num1 * this.num2;
	}

	public int getNumber1() {
		// TODO Auto-generated method stub
		return num1;
	}

	public int getNumber2() {
		// TODO Auto-generated method stub
		return num2;
	}

	public void doubleVal() {
		// TODO Auto-generated method stub
		this.num1 *= 2;
		this.num2 *= 2;
	}

}
