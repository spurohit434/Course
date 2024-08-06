package com.Threads;

public class SingleThreadedExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		// Simulate I/O-bound tasks
		for (int i = 0; i < 10; i++) {
			simulateTask(i);
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Single-threaded execution time: " + (endTime - startTime) + " ms");
	}

	private static void simulateTask(int i) {
		try {
			Thread.sleep(1000); // Simulate I/O delay
			System.out.println("Completed task " + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
