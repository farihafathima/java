package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoTryResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(url,username,password);Statement stm=con.createStatement()){
			System.out.println("Connection establied");
			String dropCmd="drop table if exists student";
			String createCmd="create table student(rollno int primary key,name varchar(20),age int)";
			stm.execute(dropCmd);
			stm.execute(createCmd);
			System.out.println("Table created...");
			String insertCmd="insert into student values(13,'xxx',20)";
			int cnt=stm.executeUpdate(insertCmd);
			System.out.println(cnt+"row inserted");
			
		}catch(SQLException se) {
			se.printStackTrace();
			
		}

	}

}
