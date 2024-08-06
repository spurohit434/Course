package com.exceptions.java;

public class ExceptionHandelingRunner2 {

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
		try {
			int[] i = { 1, 2 };
			int num = i[3];
			System.out.println(num);
//			String str = null;
//			str.length();
			System.out.println("Method2 ended"); // this will get executed once there is no exception
		} catch (NullPointerException np) {
			np.printStackTrace();
			System.out.println("Null pointer exception here");
		} catch (ArrayIndexOutOfBoundsException ex) { // specific exception handler
			ex.printStackTrace();
			System.out.println("array index out of bound exception handeled here");
		} catch (Exception ex) { // generalised exception catch block --> catch all
			ex.printStackTrace(); // print the whole stacktrace how the excepion got till here
			System.out.println("Exception is handled here");
		}
	}

}
