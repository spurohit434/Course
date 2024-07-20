package com.firstJavaClass;

public class MultiplicationTableRunner {
	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		table.print(8);
		table.print(8, 11, 20);
	}
}
