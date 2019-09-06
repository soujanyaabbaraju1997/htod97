import java.util.List;

import com.dao.MyStudentDaoImpl;
import com.dao.StudentDAO;
import com.pojos.Student;

public class TestFindAllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAO studentDAO = new MyStudentDaoImpl();
		List<Student> list = studentDAO.findAllStudents();
		list.forEach(System.out :: println);
		
		list.forEach((st) -> {
			System.out.println(st.getRollNo()+" : "+st.getStuName());
		});

	}

}
