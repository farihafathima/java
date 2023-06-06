package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoCreateSalary {

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

			String dropCmd="drop procedure if exists salary";
			String createCmd="create procedure salary(in p_empno int,out p_sal numeric(12,2)) "+
					"language plpgsql " +
                    "as $$ " +
                    "begin " +
                    "select salary into p_sal from emp where id=p_empno; "+
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
