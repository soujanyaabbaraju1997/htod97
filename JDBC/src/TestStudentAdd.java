import java.util.Scanner;

import com.dao.MyStudentDaoImpl;
import com.dao.StudentDAO;
import com.pojos.Student;

public class TestStudentAdd {
	public static void main(String[] args) {
		StudentDAO dao=new MyStudentDaoImpl();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please provide rollno");
		int rollNo=scan.nextInt();
		System.out.println("Please provide name");
		String name=scan.next();
		System.out.println("Please provide total");
		int total=scan.nextInt();
		
		Student student=new Student(rollNo, name, total);
		
		int inserted = dao.addStudent(student);
		if(inserted>0) {
			System.out.println("New student created.");
		}
		else
		{
			System.out.println("Sorry no record inserted.");
		}
	}
}
