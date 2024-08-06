package com.Colleciotns.in.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// tree to store ele in sorted order
		Set<Character> treeset = new TreeSet<>(chars);
		System.out.println(treeset);

		// maintain order but remove the duplicate -> linked se
		Set<Character> linkedset = new LinkedHashSet<>(chars);
		System.out.println(linkedset);

		// hahsset
		Set<Character> hashset = new HashSet<>(chars);
		System.out.println(hashset);

	}
}
