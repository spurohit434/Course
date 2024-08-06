package com.concurrency;

public class Bi_Counter {
	private int i = 0;
	private int j = 0;

// the problem with incI and incJ is that only one thread is allowed to access
	// the implementation
	synchronized public void incrementI() {
		i++;
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		j++;
	}

	public int getJ() {
		return j;
	}
}
