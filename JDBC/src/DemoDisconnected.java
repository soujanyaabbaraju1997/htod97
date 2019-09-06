import java.sql.ResultSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class DemoDisconnected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			JdbcRowSet jdbcRS=RowSetProvider.newFactory().createJdbcRowSet();
			jdbcRS.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jdbcRS.setUsername("rupashi");
			jdbcRS.setPassword("1234");
			jdbcRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
			String sql="select * from student";
			jdbcRS.setCommand(sql);
			jdbcRS.execute();
			while(jdbcRS.next()) {
				System.out.println(jdbcRS.getInt(1)+ ":"+ jdbcRS.getString(2));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
