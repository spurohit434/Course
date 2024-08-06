package com.Colleciotns.in.java;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String[] args) {
		String str = "This is an awesome occasion." + " This has never happened before";

//		Map<Character, Integer> occurances = new HashMap<>();
//
//		char[] chars = str.toCharArray();
//
//		for (char character : chars) {
//			occurances.get(character);
//			Integer freq = occurances.get(character);
//			if (freq == null) {
//				occurances.put(character, 1);
//			} else {
//				occurances.put(character, freq + 1);
//			}
//		}
//
//		System.out.println(occurances);

		Map<String, Integer> stringOccurances = new HashMap<>();

		String[] str1 = str.split(" ");

		for (String word : str1) {
			stringOccurances.get(word);
			Integer freq = stringOccurances.get(word);
			if (freq == null) {
				stringOccurances.put(word, 1);
			} else {
				stringOccurances.put(word, freq + 1);
			}
		}

		System.out.println(stringOccurances);
	}

}
