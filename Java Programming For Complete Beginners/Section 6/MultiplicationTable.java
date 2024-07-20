package com.firstJavaClass;

public class MultiplicationTable {
	void print() {
		print(5); // calls for print(num) method
	}

	void print(int num) {
		print(num, 1, 10); // calls for print(num,to,from) method
	}

	void print(int num, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i).println();
		}
	}
}
