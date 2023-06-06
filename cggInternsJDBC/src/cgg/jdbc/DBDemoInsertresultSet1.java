package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBDemoInsertresultSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select * from emp;";
		
		try(Connection conn=DriverManager.getConnection(url,username,password);
			PreparedStatement stm=conn.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
			ResultSet rs=stm.executeQuery(query);
			
			ResultSetMetaData rm=rs.getMetaData();
			
			int cnt=rm.getColumnCount();
			int noOfRows=1;
			while(rs.next()) {
				for(int i=1;i<=cnt;i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
				noOfRows++;
				if(noOfRows==2) {
					try {
						Thread.sleep(45000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		}}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}


	}

}
