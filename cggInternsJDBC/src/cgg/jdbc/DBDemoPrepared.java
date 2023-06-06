package cgg.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemoPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
		
		try(Connection conn=DriverManager.getConnection(url,username,password);
				PreparedStatement stm=conn.prepareStatement("insert into emp values(?,?,?)")){
			stm.setInt(1,120);
			stm.setString(2,"abcde");
			stm.setDouble(3,70000);
			
			int cnt=stm.executeUpdate();
			System.out.println(cnt+"row(s) inserted...");
			
			stm.setInt(1,121);
			stm.setString(2,"abcde");
			stm.setDouble(3,70000);
			
			cnt=stm.executeUpdate();
			System.out.println(cnt+"row(s) inserted...");
		}catch(SQLException se) {
			se.printStackTrace();
		}}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}
