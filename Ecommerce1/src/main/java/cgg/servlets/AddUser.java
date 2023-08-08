package cgg.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import cgg.doa.CategoryDoa;
import cgg.doa.ProductDoa;
import cgg.doa.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class AddUser
 */
@MultipartConfig
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String addType = request.getParameter("addType");
		
		if(addType.equals("AddUser")) {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phonenumber");
			String address = request.getParameter("address");
			UserDao.addUser(username, email, password, phone, address, "normal");
			response.sendRedirect("adminpage.jsp");
			
		}
		else if(addType.equals("AddCategory")) {
			String Name = request.getParameter("categoryName");
			String discription = request.getParameter("Description");
			CategoryDoa.addCategory(Name, discription);
			response.sendRedirect("adminpage.jsp");
			
		}
		else {
			String name = request.getParameter("productTitle");
			String productPrice = request.getParameter("productprice");
			String discount = request.getParameter("discount");
			String quantity = request.getParameter("quantity");
			String productDiscription = request.getParameter("productdiscription");
			String category = request.getParameter("category");
			Part part = request.getPart("image");
			String filename = part.getSubmittedFileName();
			InputStream is = part.getInputStream();
			byte [] data=new byte[is.available()];
			is.read(data);
			String path = getServletContext().getRealPath("/Images") + File.separator + part.getSubmittedFileName();

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			is.close();
			ProductDoa.addProducts(name,productDiscription,Integer.parseInt(productPrice),Integer.parseInt( discount),Integer.parseInt(quantity),part.getSubmittedFileName(),category);
			
			
			
			response.sendRedirect("adminpage.jsp");
		}
	}

}
