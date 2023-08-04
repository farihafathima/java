package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class DisConfigDemo extends GenericServlet {
	private int count=0;
	
	public void init(ServletConfig sc) {
		count=Integer.parseInt(sc.getInitParameter("count"));
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("value of the count:"+count);
		out.close();
	}

}
