package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bi_CounterWithLock {
	// private int i = 0;
	private AtomicInteger i = new AtomicInteger();
	// private int j = 0;
	private AtomicInteger j = new AtomicInteger();

	Lock LockForI = new ReentrantLock();
	Lock LockForJ = new ReentrantLock();

	public void incrementI() {
//		LockForI.lock(); // get lock for I, at one time only one thread can have the lock for I
//		i++;
//		LockForI.unlock(); // release for lock, the thread will wait for the current lock to realease
		// before its execution

		i.incrementAndGet(); // for atomicInteger class, and it does an atomic ( increment operation)
	}

	public int getI() {
		// return i;

		return i.get(); // for atomicInteger class
	}

	public void incrementJ() {
//		LockForJ.lock();// get lock for J
//		j++;
//		// releases for lockJ[w
//		LockForJ.unlock();

		j.incrementAndGet(); // does an increment operation
	}

	public int getJ() {
		// return j;

		return j.get(); // for atomicINteger class
	}
}

// concurrent collections provides Thread safety w/o significant 
// performance impact in specific scenarios e.g. Collections Hashmap
