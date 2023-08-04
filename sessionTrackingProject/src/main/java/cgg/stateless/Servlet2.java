package cgg.stateless;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		String name = request.getParameter("name");
		Cookie[] cookies = request.getCookies();
		
		boolean f=false;
		String name="";
		
		if(cookies==null) {
			out.println("<h1> you are a new user go to home page and submit your name</h1>");
			return;
			
		}
		else {
			for (Cookie c:cookies) {
				String tname=c.getName();
				if(tname.equals("user_name")) {
					f=true;
					name=c.getValue();
				}
			}
		}
		
		if(f) {
			
			out.println("<h1>Hello , "+name+"welcome back to my website.....</h1>");
			out.println("<h1>Thank you</h1>");
			
		}
		else {
			out.println("<h1> you are a new user go to home page and submit your name</h1>");
		}
		
	}

}
