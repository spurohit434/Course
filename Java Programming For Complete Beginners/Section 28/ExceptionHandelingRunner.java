package com.exceptions.java;

public class ExceptionHandelingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1(); // NullPointerException , str can not be null if we are finding the length
		System.out.println("Main ended"); // this will not be executed as the excepton was not hadled
	}

	private static void Method1() { // if it is not handeling the exception than it throws up
		Method2(); // stack trace is craeted bcuz of excepions
		System.out.println("Method1 ended");
	}

	private static void Method2() { // here as exception occured and it it is not handled than it is thrown up
		String str = null; // exception go up the call chain
		str.length();
		System.out.println("Method2 ended");
	}

}
