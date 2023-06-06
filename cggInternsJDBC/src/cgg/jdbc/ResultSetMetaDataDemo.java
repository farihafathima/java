package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select *from emp where 1=2";
		
		try(Connection conn=DriverManager.getConnection(url,username,password); Statement stm=conn.createStatement();ResultSet rs=stm.executeQuery(query)){
			
			
			ResultSetMetaData rm=rs.getMetaData();
			int cnt=rm.getColumnCount();
			
			for(int i=1;i<=cnt;i++) {
				System.out.print(rm.getColumnName(i)+"\t");
				System.out.print(rm.getColumnType(i)+"\t");
				System.out.print(rm.getColumnTypeName(i)+"\t");
				System.out.print(rm.getColumnClassName(i)+"\t");
				System.out.println();
			}
			
		}
			
	}catch(SQLException se) {
		se.printStackTrace();}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}

}}
