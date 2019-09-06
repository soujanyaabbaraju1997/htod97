import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Register driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("Driver loaded successfully");
					
					//2. get the connection
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rupashi", "1234");
					System.out.println("Connection obtained.");
					
					String INSERT_STUDENT="insert into student values(?,?,?)";
					PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);
					int rollNO=99;
					String name="name123";
					int total=300;
					
					ps.setInt(1, rollNO);
					ps.setString(2, name);
					ps.setInt(3, total);
					
					int rows = ps.executeUpdate();
					System.out.println("rows: "+rows);					
					
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		
	}

}
