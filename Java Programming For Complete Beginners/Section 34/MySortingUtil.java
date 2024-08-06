package com.modularization_1_java_util;

import java.util.List;

import com.modularization_1_java_sortingAlgo.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bs = new BubbleSort();
		bs.sort(names);

		return names;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
