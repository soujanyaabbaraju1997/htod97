import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
		
public class DemoMetaData {

	public static void main(String[] args) {
				
				String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
				String username="rupashi";
				String password="1234";
				String sql="select * from student";
				
				try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
						PreparedStatement stmt = conn.prepareStatement(sql, 
								ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
							)
				{
					ResultSet rs = stmt.executeQuery();
					ResultSetMetaData metadata = rs.getMetaData();
					System.out.println("Metadata count (no of columns):"+ metadata.getColumnCount());
					for(int i=1;i<=metadata.getColumnCount();i++)
					{
						System.out.println(metadata.getColumnName(i)+" "+ metadata.getColumnType(i));
					}
					
					DatabaseMetaData dmeta=conn.getMetaData();
					System.out.println(dmeta.getDatabaseProductName());
					
				} 		
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}


}
