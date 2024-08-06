package com.OOP2again;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.color = color;
		this.make = make;
		this.radius = radius;
	}

	public String tostring() {
		return String.format("make %s, radius %f, color %s, isOn %b, speed %d", make, radius, color, isOn, speed);
	}

	public void switchOn() {
		// TODO Auto-generated method stub
		this.isOn = true;
		this.speed = (byte) 5;
	}

	public void setSpeed(byte b) {
		// TODO Auto-generated method stub
		this.speed = b;
	}

	public void switchOff() {
		// TODO Auto-generated method stub
		this.isOn = false;
		this.speed = 0;
	}
}
