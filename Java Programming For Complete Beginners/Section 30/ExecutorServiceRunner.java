package com.Threads;

import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\nTask" + number + "started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask" + number + "started");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java.util.concurrent.ExecutorService executorService = Executors.newSingleThreadExecutor();
		java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));

		// executorService.execute(new Thread(new Task2()));

//		System.out.println("\nTask5 Kicked Off");
//		for (int i = 301; i <= 399; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask5 done");
//
//		System.out.println("\n Main done");

		executorService.shutdown();
	}

}
