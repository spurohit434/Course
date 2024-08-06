package com.modularization_consumer;

import java.util.List;
import java.util.logging.Logger;

import com.modularization_1_java_sortingAlgo.BubbleSort;

public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("kapil", " arun", "kunal", "shailesh"));
		logger.info(sorted.toString());
		// logger.isLoggable(3);
	}
}
