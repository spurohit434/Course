package com.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// threads 3
		list.add("bag");
		list.add("Cat");
		list.add("Ant");

		// threads 10000
		for (String elements : list) {
			System.out.println(elements);
		}
	}

}
