package com.OOP2again;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Sujata", 30.2344, "Red");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		String s1 = fan.tostring();
		System.out.println(s1);
		fan.switchOff();
		String s11 = fan.tostring();
		System.out.println(s11);
	}
}
