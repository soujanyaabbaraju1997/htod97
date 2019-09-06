import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {

	public static void main(String[] args) {
	
		//1. Register driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
			//2. get the connection
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
			System.out.println("Connection obtained.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
