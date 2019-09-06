import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DemoTransaction {
	
//Transaction management
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
			connection.setAutoCommit(false);
			System.out.println("Got connection");
			
			Statement st=connection.createStatement();
			
			st.addBatch("insert into student values(5000, 'nam1', 123)");
			st.addBatch("insert into student values(5001, 'nam1', 123)");
			st.addBatch("insert into student values(5002, 'nam1', 123)");
			//st.addBatch("insert into student values(5000, 'nam1', 123)");
			st.addBatch("insert into student values(5003, 'nam1', 123)");
			
			st.executeBatch();
			System.out.println("Inserted batch.");
			connection.commit();		
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
    }
}


