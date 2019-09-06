package com.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dao.MyStudentDaoImpl;
import com.pojos.Student;

class Test_MyStudentDAOImpl {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindByRollno() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddStudent_Negative() {
		//fail("Not yet implemented");
		
		MyStudentDaoImpl daoImpl = new MyStudentDaoImpl();
		//Student student = new Student(1000, "stuName",10);
		Student student = new Student(5000, "stuName",10);
		int actual = daoImpl.addStudent(student);
		
		//assertEquals(1, actual); //true test case
		assertEquals(0, actual); //false test case
	}

	@Test
	public void testUpdateStudent() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindAllStudents() {
		//fail("Not yet implemented");
		
		MyStudentDaoImpl daoImpl = new MyStudentDaoImpl();
		List<Student> students = daoImpl.findAllStudents();
		assertEquals(8, students.size());
		
		Student student = students.get(0);
		assertEquals(23, student.getRollNo());
		assertEquals("rupashi", student.getStuName());
		assertEquals(340, student.getTotal());
		
	}

	@Test
	public void testDeleteStudent() {
		//fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		//fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		//fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		//fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		//fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		//fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		//fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		//fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		//fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		//fail("Not yet implemented");
	}

}
