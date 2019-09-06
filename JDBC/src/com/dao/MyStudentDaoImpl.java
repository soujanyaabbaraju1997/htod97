package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojos.Student;

public class MyStudentDaoImpl implements StudentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Connection openConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");

			// 2. get the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soujanya", "soujanya");
			System.out.println("Connection obtained.");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	@Override
	public Student findByRollno(int rollno) {
		// TODO Auto-generated method stub

		Student stud = new Student();
		String FIND_BY_ROLL = "select * from student where rollno=?";

		try {
			PreparedStatement ps = openConnection().prepareStatement(FIND_BY_ROLL);
			ResultSet set = ps.executeQuery();

			while (set.next()) {

				stud.setRollNo(set.getInt("rno"));
				stud.setStuName(set.getString("name"));
				stud.setTotal(set.getInt("total"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stud;
	}

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		int rows = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");

			// 2. get the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
			System.out.println("Connection obtained.");

			String INSERT_STUDENT = "insert into student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);

			ps.setInt(1, student.getRollNo());
			ps.setString(2, student.getStuName());
			ps.setInt(3, student.getTotal());

			rows = ps.executeUpdate();
			System.out.println("rows inserted: " + rows);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rows;

	}

	@Override
	// write single function for updating records during project
	public boolean updateStudent(int rollNo, String name) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;

		String STUDENT_UPDATE = "update student set name=? where rno=?";
		try {
			PreparedStatement ps = openConnection().prepareStatement(STUDENT_UPDATE);
			ps.setString(1, name); // 1 is column no
			ps.setInt(2, rollNo);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isUpdated;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<Student>();

		String FIND_ALL_STUDENTS = "select * from student";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");

			// 2. get the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
			System.out.println("Connection obtained.");

			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(FIND_ALL_STUDENTS);
			while (set.next()) {

				int rollNo = set.getInt("rno");
				String name = set.getString("name");
				int total = set.getInt("total");
				Student student = new Student(rollNo, name, total);
				students.add(student);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return students;

	}

	@Override
	public Student deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		
		Student stud=findByRollno(rollNo);
		boolean isDeleted = false;
		
		String STUDENT_DELETE="delete from student where rno=?";
		try {
			PreparedStatement ps=openConnection().prepareStatement(STUDENT_DELETE);	
			
			if(stud.getRollNo()>0) {				
				ps.setInt(1, rollNo);
				int i = ps.executeUpdate();
				if(i>0) {
					isDeleted=true;
					System.out.println("Record deleted.");
				}
				else
				{
					System.out.println("sorry, record could not be deleted.");
				}
			}
			else
			{
				System.out.println("sorry, record not found.");
			}
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return stud;
}
	
}
