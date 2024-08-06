package com.exceptions.java;

public class CheckedExceptionRunner { // forced to handle exception

	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000); // possibility that it will throw an exception & when a method say that it will
			// throw an error then we are forced to handle it.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// someOtherMethod2();
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

	private static void someOtherMethod2() throws RuntimeException, Exception {
		// runtimeExcepion in main method if not put inside the
		// try catch then also it will not throw error
	}

}

// to remove the throw exception we have two methods:
//1. using the try catch block 
//2. using throw InterruptedException

// we can prevent error but not handle them 

// class Error extends Throwable{}
// class Exception extends Throwable{}
// class InterruptedException extends Exception{}
// class RuntimeException extends Exception{}
// class NullPointerException extends RuntimeException{}

// runtime exception ->  Unchecked Exceptions
// Exception which are exception but not under runTImeException or not is itself runTImeException ->  Checked Exceptions ( Risky exceptions )