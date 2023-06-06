package cgg.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.Connection;
public class DbDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		Properties properties=new Properties();
		properties.put("user", "postgres");
		properties.put("password","#Fariha9515");
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection(url,properties);
			System.out.println("Connection Established....");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		

	}

}
