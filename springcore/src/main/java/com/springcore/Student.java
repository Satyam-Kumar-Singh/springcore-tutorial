package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", studentName=");
		builder.append(studentName);
		builder.append(", studentAddress=");
		builder.append(studentAddress);
		builder.append("]");
		return builder.toString();
	}

}
