package cgg.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			try(Connection conn=DriverManager.getConnection(url,username,password);
					Statement stm=conn.createStatement()){
					
					stm.addBatch("insert into emp values(301,'eee',45000)");
					stm.addBatch("insert into emp values(302,'fff',55000)");
					stm.addBatch("insert into emp values(303,'bbb',40000)");
					
					int [] counts;
					try {
						counts=stm.executeBatch();
					}catch(BatchUpdateException be) {
						counts=be.getUpdateCounts();
					}
				for(int i=0;i<counts.length;i++) {
					switch(counts[i]) {
					case Statement.SUCCESS_NO_INFO:
						System.out.println("Success no info");
						break;
					case Statement.EXECUTE_FAILED:
						System.out.println("Execution failed");
						break;
					default:
						System.out.println(counts[i]+"row(s) effected");
					}
				}
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
		}
	}

}
