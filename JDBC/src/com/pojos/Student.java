package com.pojos;


import java.io.Serializable;

public class Student implements Serializable {
	
	private String stuName;
	private int rollNo;
	private int total;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", rollNo=" + rollNo + ", total=" + total + "]";
	}
	public Student( int rollNo, String stuName, int total) {
		this.stuName = stuName;
		this.rollNo = rollNo;
		this.total = total;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public static void main(String[] args) {
		
//		Student s1 = new Student("raju", 23, 97);
//		Student s2 = new Student("priya", 19, 88);
//		Student s3 = new Student("dave", 25, 57);
	}
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
