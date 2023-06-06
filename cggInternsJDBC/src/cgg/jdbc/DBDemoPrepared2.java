package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class DBDemoPrepared2 {
		
		// TODO Auto-generated method stub
			static ResultSet rs;
			static int cnt;
			public static void displayColumnHeading() {
				try {
					
				ResultSetMetaData rm=rs.getMetaData();
				cnt=rm.getColumnCount();
				for(int i=1;i<=cnt;i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}catch(Exception e) {}
			}
				
			static void displayData() {
				try {
					while(rs.next()) {
						for(int i=1;i<=cnt;i++) {
							System.out.print(rs.getString(i)+"\t");
						}
						System.out.println();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public static void main(String [] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select *from emp where id=?";
		
		try(Connection conn=DriverManager.getConnection(url,username,password); PreparedStatement ps=conn.prepareStatement(query)){
			// ps=conn.prepareStatement(query);
			ps.setInt(1, 112);
			rs=ps.executeQuery();
			displayColumnHeading();
			displayData();
			
			ps.setInt(2, 113);
			rs=ps.executeQuery();
			displayData();
			rs.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
