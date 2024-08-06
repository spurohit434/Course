package com.Colleciotns.in.java;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.length(), s2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q1 = new PriorityQueue<>(new StringLengthComparator());
		q1.addAll(List.of("zebra", "MOnket", "cat", "lion"));
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());
	}

}
