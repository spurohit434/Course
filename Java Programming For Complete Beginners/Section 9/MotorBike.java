package com.OOPinJava;

public class MotorBike {
	// state of object
	private int speed;

	// constructor (no return type, speacial type of method ,name same as that of
	// the
	// class
	MotorBike() {
		this(5); // will call another constructor
		System.out.println("Constructor called");
		this.speed = 5; // default value

	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behaviour
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void getSpeed() {
		System.out.printf("Speed is %d", speed).println();
	}

	void start(String s1) {
		System.out.printf("Bike Started %s", s1).println();
	}

	void incSpeed(int howMuch) {
		this.speed += howMuch;
	}

	void decSpeed(int howMuch) {
		if (this.speed - howMuch > 0) {
			this.speed -= howMuch;
		}
	}
}
