package com.FunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Apple", "Bannaa", "Cat", "Dog", "Bat");

		printBasic(list);
		printWithFP(list);

		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
//		numbers.stream()
//		.forEach(element -> System.out.println(element));
		int sum = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);

		// print squares of first 10 nums
		IntStream.range(1, 10);

	}

	private static void printBasic(List<String> list) {
		for (String str : list) {
			if (str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

}
