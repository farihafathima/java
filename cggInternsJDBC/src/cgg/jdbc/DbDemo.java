package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

import java.sql.Connection;
public class DbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		//register driver with diver manger class
		//registering driver with driver manager
		try {
			//Class.forName("org.postgresql.Driver");
			//get connection object
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("connection Establised.....");
			connection.close();}
//		 catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
