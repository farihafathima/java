package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select * from emp";
			try(Connection conn=DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement();ResultSet rs=stm.executeQuery(query);){
				ResultSetMetaData rm=rs.getMetaData();
				int cols=rm.getColumnCount();
				for(int i=1;i<=cols;i++) {
					System.out.print(rm.getColumnName(i)+"\t");
				}
				System.out.println();
//				while(rs.next()) {
//					System.out.print(rs.getString(1)+"\t");
//					System.out.print(rs.getString(2)+"\t");
//					System.out.print(rs.getString(3)+"\t");
//					System.out.println();}
				while(rs.next()) {
					for(int i=1;i<=cols;i++) {
						System.out.print(rs.getString(i)+"\t");
					}
					System.out.println();
				}
				
				
			}catch(SQLException se) {
				se.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
