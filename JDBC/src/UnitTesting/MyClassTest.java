package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pojos.Student;

class MyClassTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testAddStudent() {
		
		Student daoImpl = new Student();
		Student student = new Student(1000,"stuName",1);
		int actual = daoImpl.addStudent(student);
		assertEquals(0,actual);
	}

	@Test
	void testDiv() {
		MyClass obj = new MyClass();
		
		double actual = obj.div(10, 5);
		
		assertEquals(2, actual);
	}
	
	@Test
	public void testDiv_negative() {
		MyClass obj = new MyClass();
		
		double actual = obj.div(10, 3);
		
		assertEquals(3.333333333D, actual, 0.001);
	}

}
