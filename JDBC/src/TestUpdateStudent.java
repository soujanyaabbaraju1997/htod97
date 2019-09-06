import com.dao.MyStudentDaoImpl;
import com.dao.StudentDAO;

public class TestUpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rollNo=34;
		String name="dcunha";
		
		StudentDAO student= new MyStudentDaoImpl();
		if(student.updateStudent(rollNo, name)) {
			System.out.println("record updated.");
		}
		else
		{
			System.out.println("sorry not updated.");
		}
		
	}

}
