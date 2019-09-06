import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableResultSet {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "rupashi";
		String password = "1234";
		String sql = "select rno, name, total from student";
		
		try(Connection con = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement stmt = con.prepareStatement(sql, 
						ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					)
		{
			ResultSet rs= stmt.executeQuery();
			//Save current cursor position and move cursor to insert row,
			rs.moveToInsertRow();
			//Set column values
			rs.updateInt("rno", 55);
			rs.updateString("name", "shruti");
			rs.updateInt("total", 100);
			//insert new row
			rs.insertRow();
			
			//Move cursor back to saved position
			rs.moveToCurrentRow();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
