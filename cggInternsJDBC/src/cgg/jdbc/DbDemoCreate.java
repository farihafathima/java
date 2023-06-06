package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DbDemoCreate {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement stm=conn.createStatement();
			stm.execute("create table emp(id int primary key,ename varchar(40),salary numeric(12,2))");
			System.out.println("table created");
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
			
		}
		

	}

}
