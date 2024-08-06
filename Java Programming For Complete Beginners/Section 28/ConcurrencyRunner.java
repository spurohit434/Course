package com.concurrency;

class User1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask1 started");
		Counter ct1 = new Counter();
		ct1.increment();
		ct1.increment();

		System.out.println("In task1: " + ct1.getI());
		System.out.println("\nTask1 ended");
	}
}

class User2 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask2 started");
		Counter ct2 = new Counter();
		ct2.increment();
		ct2.increment();
		ct2.increment();
		ct2.increment();
		System.out.println("In task2: " + ct2.getI());
		System.out.println("\nTask2 ended");
	}
}

public class ConcurrencyRunner {

	public static void main(String[] args) {
//		User1 user1 = new User1();
//		user1.start();
//
//		User2 user2 = new User2();
//		user2.start();

		Bi_CounterWithLock bl1 = new Bi_CounterWithLock();
		Bi_CounterWithLock bl2 = new Bi_CounterWithLock();
		bl1.incrementI();
		bl1.incrementJ();
//
//		ExecutorService ex = Executors.newFixedThreadPool(3);
//		
//		for(int i=0;i<3;i++) {
//			ex.
//		}
//
//		System.out.printf("values: %d, %d ", bl1.getI(), bl1.getJ());
//		bl2.incrementI();
//		bl2.incrementJ();
//		System.out.printf("values: %d, %d", bl2.getI(), bl2.getJ());

	}

}
