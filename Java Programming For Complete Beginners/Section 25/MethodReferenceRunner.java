package com.FunctionalProgramming;

import java.util.List;

public class MethodReferenceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of("ant", "bat", "cat", "elephant").stream().map(s -> s.length()).forEach(s -> System.out.println(s));

		List.of("ant", "bat", "cat", "elephant").stream().map(s -> s.length()).forEach(System.out::println);

	}

}
