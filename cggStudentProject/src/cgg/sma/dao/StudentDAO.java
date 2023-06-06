package cgg.sma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import cgg.sma.manage.ConnectionProvider;
import cgg.sma.model.*;
public class StudentDAO {

	static Connection conn;

	public StudentDAO() {
		super();
		conn=ConnectionProvider.createConnection();
		// TODO Auto-generated constructor stub
		
	}
	public boolean insertStudentoDB(Student st) {
		boolean f=false;
		try {
			String q="insert into student1 (studentname,studentphone,studentcity)values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(q);
			//set the values of parameters
			ps.setString(1,st.getName());
			ps.setString(2,st.getPhone());
			ps.setString(3,st.getCity());
			
			//execute....
			
			ps.executeUpdate();
			f=true;
		}catch(SQLException e) {
			
		}
		return f;
	}
public boolean deleteStudent(int userId) {
	boolean f=false;
	
	try {
		String q="delete from student1 where studentid=? ";
		//preparing statement...
		PreparedStatement ps=conn.prepareStatement(q);
		//set the parameters
		ps.setInt(1,userId);
		
		//execute
		ps.executeUpdate();
		
		f=true;
	}catch(SQLException e) {
		System.out.println(e);
	}
	return f;
	
}
public boolean updateStudent(Student st) {
	boolean f=false;
	try {
		String q="update student1 set studentname=?,studentphone=?,studentcity=? where studentid=? ";
		//preparing statement...
		PreparedStatement ps=conn.prepareStatement(q);
		//set the parameters
		ps.setString(1,st.getName());
		ps.setString(2,st.getPhone());
		ps.setString(3,st.getCity());
		ps.setInt(4, st.getStudentId());
		
		//execute
		ps.executeUpdate();
		
		f=true;
	}catch(SQLException e) {
		System.out.println(e);
	}
	return f;
}

	public   void showAll() {
		// TODO Auto-generated method stub
		try {
			String q="select * from student1";
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(q);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString(4);
				
				
				System.out.println("ID:"+id);
				System.out.println("NAME:"+name);
				System.out.println("PHONE:"+phone);
				System.out.println("CITY:"+city);
				System.out.println("---------------------------------------------");
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
