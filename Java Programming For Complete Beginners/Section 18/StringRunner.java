package com.intro_arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wednes", "Thurs", "Fri", "Satur" };
		String thatDay = "";
		for (String day : daysOfWeek) {
			if (day.length() > thatDay.length()) {
				thatDay = day;
			}
		}
		System.out.println(thatDay);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
