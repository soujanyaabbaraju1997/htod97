package com.dao;

import java.util.List;

import com.pojos.Student;

public interface StudentDAO {
	
	int addStudent(Student student);
	boolean updateStudent(int rollNo, String name);
	List<Student> findAllStudents();
	Student findByRollno(int rollno);
	Student deleteStudent(int rollNo);	

}
