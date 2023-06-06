package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DbDemoCreate2 {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement stm=conn.createStatement();
			String dropCmd="drop table if exists attachment";
			String createCmd="create table attachment(id serial primary key,filename varchar(40),filedata bytea)";
			stm.execute(dropCmd);
			stm.execute(createCmd);
			System.out.println("table created");
			stm.close();
			conn.close();
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
			
		}
		

	}

}
