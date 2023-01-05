package com.assignment4;

import java.util.List;

public class Student {

	private String studentId;
	private String studentName;
	private List<Test> test;
	
	public Student() {
	}

	public Student(String studentId, String studentName, List<Test> test) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.test = test;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Test> getTest() {
		return test;
	}

	public void setTest(List<Test> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", test=" + test + "]";
	}
	
	
}
