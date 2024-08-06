package com.FunctionalProgramming;

import java.util.List;

public class LambdaBehindTheScreens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(23, 43, 34, 45).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));
	}

}
