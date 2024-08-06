package com.modularization_consumer;

import java.util.List;
import java.util.logging.Logger;

import com.modularization_1_java_util.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("kapil", " arun", "kunal", "shailesh"));
		// System.out.println(logger);
		logger.info(sorted.toString());

	}
}

// Notes
// logger class 
