import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DemoCallable {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
			System.out.println("Got connection");
			
			String PRO_INSERT = "{call INSERTR(?,?,?)}";
			CallableStatement stmt = connection.prepareCall(PRO_INSERT);
			stmt.setInt(1, 190);
			stmt.setString(2, "XYZ");
			stmt.setInt(3, 400);
			stmt.execute();
			System.out.println("Inserted");
			
			// in and out parameter
			String PRO_FIND = "{call GETSTUDENT(?,?)}";
			CallableStatement stmt2 = connection.prepareCall(PRO_FIND);
			stmt2.setInt(1, 34);
			stmt2.registerOutParameter(2, Types.VARCHAR);
			stmt2.execute();
			
			System.out.println("Product name = "+ stmt2.getString(2));
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
    }
}
