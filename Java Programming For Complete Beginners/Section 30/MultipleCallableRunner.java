package com.Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("in32minutes"), new CallableTask("Rama"),
				new CallableTask("sundar"));

//		List<Future<String>> results = executorService.invokeAll(tasks); //
//		// invokeAll() is used to invoke all the
//		// threads

//		for (Future<String> result : results) {
//			System.out.println(result.get());
//		}

		String results1 = executorService.invokeAny(tasks); // invokeAny() is used to invoke the fastest
//															// threads
		System.out.println(results1);

		executorService.shutdown();

		// invokeAny() method used to get the fastest thread executing from the given
		// threads
	}

}
