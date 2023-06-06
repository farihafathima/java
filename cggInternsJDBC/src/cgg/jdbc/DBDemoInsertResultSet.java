package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBDemoInsertResultSet {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select * from emp;";
		
		try(Connection conn=DriverManager.getConnection(url,username,password);
			Statement stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)){
			ResultSet rs=stm.executeQuery(query);
			
			rs.moveToInsertRow();
			
			rs.updateInt(1,401);
			rs.updateString(2, "ijk");
			rs.updateDouble(3,40000);
			
			rs.insertRow();
			rs.moveToCurrentRow();
			
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

}
