import java.util.Scanner;

import com.dao.MyStudentDaoImpl;
import com.dao.StudentDAO;
import com.pojos.Student;

public class TestDeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rollno to be deleted\n");
		int rollNo=scan.nextInt();
		
		StudentDAO studentDAO = new MyStudentDaoImpl();		
		Student stud_obj= studentDAO.deleteStudent(rollNo);
		
		if(stud_obj!=null) {
			System.out.println("Deleted record:");
			System.out.println(stud_obj);
		}
		else
		{
			System.out.println("sorry, record not deleted");
		}
		
		

	}

}
