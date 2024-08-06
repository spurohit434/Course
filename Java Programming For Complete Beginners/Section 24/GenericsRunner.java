package com.genericsInJava;

import java.util.List;

public class GenericsRunner {

	// generics with method
	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X string) {
		string.addAll(string);
	}

	static double sumOfNumbers(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number num : numbers) {
			sum += num.doubleValue();
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomList<String> list = new MyCustomList();
		list.addElement("ele1");
		list.addElement("ele2");
		String val = list.get(0);
		System.out.println(val);

		MyCustomList<Integer> list1 = new MyCustomList();
		list1.addElement(1);
		list1.addElement(2);
		Integer num = list1.get(0);
		System.out.println(num);

		String str = new String("hello");
		// duplicate(str);
		System.out.println(doubleValue(str));

		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumbers(List.of(1.1, 2.22, 3, 4, 5)));
		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4, 43, 7.65, 5l)));

	}

}
