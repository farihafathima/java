package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class DBDemoCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String cmd="delete from emp where id=?";
			try(Connection conn=DriverManager.getConnection(url,username,password);
					PreparedStatement ps=conn.prepareStatement(cmd)){
					conn.setAutoCommit(false);
					ps.setInt(1, Integer.parseInt(args[0]));
					 int count=ps.executeUpdate(cmd);
					 if(count>0) {
						 System.out.println("Employee deleted");
					 }
					 else {
						 System.out.println("no such file exist...");
					 }
					 conn.commit();
					 System.out.println("Transaction committed");
					 conn.setAutoCommit(true);
			}
		}
		catch(ClassNotFoundException |SQLException e) {
			System.out.println(e);
		}
	}

}
