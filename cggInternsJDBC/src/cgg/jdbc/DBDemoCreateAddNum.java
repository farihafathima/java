package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoCreateAddNum {

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
		try(Connection conn=DriverManager.getConnection(url,username,password);
				Statement stm=conn.createStatement()){
			
			String dropCmd="drop procedure if exists apAddNum";
			String createCmd="create procedure spAddNum(in a int,in b int,out c int) "+
					"language plpgsql " +
                    "as $$ " +
                    "begin " +
                    "c := a + b; " +
                    "end; " +
                    "$$";
			stm.execute(dropCmd);
			stm.execute(createCmd);
			System.out.println("procedure created....");
			
		}catch(SQLException se) {
			System.out.println(se);
		}
	}

}
