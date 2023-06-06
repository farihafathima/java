package cgg.jdbc;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DbDemoCallGetSalary {
	public static void main(String [] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String sql="Call salary(?,?)";
			try(Connection conn=DriverManager.getConnection(url,username,password);
       				CallableStatement cs=conn.prepareCall(sql)) {
				cs.setInt(1, Integer.parseInt(args[0]));
				cs.registerOutParameter(2, Types.NUMERIC);
				
				cs.execute();
				
				BigDecimal sal=cs.getBigDecimal(2);
				System.out.println("salary is "+sal);
			}
				
	}catch(ClassNotFoundException |SQLException e) {
		System.out.println(e);
	}
}}
