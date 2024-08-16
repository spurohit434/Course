package com.springcore.SpringCore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [students=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public Student(int students, String studentName, String studentAddress) {
		super();
		this.studentId = students;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudents() {
		return studentId;
	}

	public void setStudentId(int students) {
		System.out.println("setting student id");
		this.studentId = students;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting student Name");

		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student address");

		this.studentAddress = studentAddress;
	}

}
