package com.Colleciotns.in.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		return Integer.compare(stu1.getId(), stu2.getId());
	}

}

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto method stub
		List<Student> students = List.of(new Student(81, "Ramaa"), new Student(22, "Arun"), new Student(333, "Kapss"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println("Ascending order: " + studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Descending order: " + studentsAl);

	}

}
