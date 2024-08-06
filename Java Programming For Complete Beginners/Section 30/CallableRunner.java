package com.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000); // as in a thread a lot of processing is included
		return "hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("helloworld")); // submit method is used

		// Create a Callable task
		// Callable<String> task = new CallableTask("Ramesh");

		// Submit the task and get a Future object
//		Future<String> welcomeFuture = executorService.submit(task); // to execute a callable
//		// value
//		System.out.print("\n new callbletask(\"hello world\") executed");

		String welcomeMsg = welcomeFuture.get();
		System.out.println(welcomeMsg);
		System.out.println("main completed ");
		// how to return a value using the callable

		executorService.shutdown();

	}

}
