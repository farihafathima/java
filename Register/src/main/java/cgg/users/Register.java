package cgg.users;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		//getting all the incoming  details from the request..all..
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		
		out.println(name);
		out.println(password);
		out.println(email);
		
		
		//connection.....
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/register" );
			
			//query
			
			String q="insert into users(name,password,email,imageName) values(?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(q);
			
			pstmt.setString(1,name);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			pstmt.setString(4, filename);
			
			
			//upload
			
			InputStream is=part.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			String path=request.getContextPath()+File.separator+"images"+File.separator+filename;
			
			out.println("done");
		}catch(Exception e) {
			out.println("error");
		}
	}

}
