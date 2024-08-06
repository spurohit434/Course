package com.exceptions.java;

import java.util.Scanner;

public class FinallyRunner { // let about the use of finally in exception handeling

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
			int num = numbers[4];
			System.out.println(num);
			System.out.println("\nBefore scanner close ");
			// sc.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("\nBefore scanner close in exception ");
			// sc.close();
		} finally { // guaranteed execution -> here the resources used are closed which are consumed
			System.out.println("\nBefore the scanner close in finally");
			if (sc != null) { // we can even check before closing the scanner resource
				sc.close();
			}
		} // we use finally block bcuz it is executed for sure but it enusres that we
			// should must not repeat the same code in try and catch when we are not sure
			// about the exception
			// finally block will always get executed whether there is exception or return
			// or No exception

		System.out.println("\nJust before closing out main");
	}
}

// the code in finally will not get executed when:
// 1. JVM crash --> System.exit(1)
// 2. The line before the sc.close() throws an exception 
