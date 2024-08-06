package com.Threads;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask1 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 done");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask2 started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 done");

	}
}

public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Task1
		System.out.println("\nTask1 kicked off");
		Task1 task1 = new Task1();
		// task1.setPriority(10);
		task1.start(); // not task1.run()

//		for (int i = 201; i <= 299; i++) {
//			System.out.print(i + " ");
//		}
		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2(); // implemented using runnable interface
		Thread thread = new Thread(task2);
		thread.start(); // task2 thread

		// wait for task1 to complete
		// task1.join();

		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 done");

		System.out.println("\n Main done");
	}

}
