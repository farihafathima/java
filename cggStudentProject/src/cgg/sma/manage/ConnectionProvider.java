package cgg.sma.manage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection conn;
	public static Connection createConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/cgg_interns";
			String username="postgres";
			String password="#Fariha9515";
			conn=DriverManager.getConnection(url,username,password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}

}
