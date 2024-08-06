package com.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CustomException extends Exception {
	public CustomException(String msg) {
		System.out.println(msg);
	}
}

public class MultiThreadedExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			final int taskId = i;
			executor.submit(() -> simulateTask(taskId));
		}

		executor.shutdown();
		while (!executor.isTerminated()) {
			// Wait for all tasks to complete
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Multi-threaded execution time: " + (endTime - startTime) + " ms");
	}

	private static void simulateTask(int i) { // synchronized
		try {
			Thread.sleep(1000); // Simulate I/O delay
			System.out.println("Completed task " + i);

//			Path pathFiletoRead = Paths.get("./Resources/Da.txt");
//			String msg = "Custom Exception Occured ";
//			if (!Files.exists(pathFiletoRead)) {
//				throw new CustomException(msg);
//			} else {
//				List<String> lines = Files.readAllLines(pathFiletoRead);
//				System.out.println(lines);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
