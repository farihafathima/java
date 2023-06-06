package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoUpdate {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			try(Connection conn=DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()){
				String updateCmd="update emp set ename='Pop',salary=60000 where id=112";
				//String deleteAllCmd="delete from emp";
				int cnt=stm.executeUpdate(updateCmd);
				System.out.println(cnt+"rows complete");
			}catch(SQLException se) {
				se.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
