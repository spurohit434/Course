package com.exceptions.java;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) { // directly passing the scanner in try params
			int[] numbers = { 12, 3, 4, 5 };
			int num = numbers[4];
		}
		// Here in this Try block we write the scanner inside of the try
		// params as here we need not manually close the scanner class
		// here if any occurs in code then the try block automatically close the scanner
		// class using the auto closable class
		System.out.println("\nJust before closing out main");
	}
}
