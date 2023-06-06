package cgg.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			Statement stm=con.createStatement();
			
			int id=Integer.parseInt(args[0]);
			String ename=args[1];
			Double salary=Double.parseDouble(args[2]);
			
			String inserCmd="insert into emp values("+id+",'"+ename+"',"+salary+")";
			
			int cnt=stm.executeUpdate(inserCmd);
			
			
			System.out.println(cnt +"row(s) inserted");
			
			 stm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
