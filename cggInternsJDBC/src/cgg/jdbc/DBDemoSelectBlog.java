package cgg.jdbc;

import java.sql.DriverManager;
import java.io.Blob;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.File;


public class DBDemoSelectBlog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="#Fariha9515";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select filename,filedata from attachment where id=?";
			try(Connection conn=DriverManager.getConnection(url,username,password);
				PreparedStatement ps=conn.prepareStatement(query)	){
				
				
				ps.setInt(1, Integer.parseInt(args[0]));
				ResultSet rs=ps.executeQuery();
				
				String saveDrive="./temp";
				
				while(rs.next()) {
					String fileName =rs.getString("filename");
					
					File file=new File(saveDrive,fileName);
					FileOutputStream fos=new FileOutputStream(file);
				   java.sql.Blob blob=rs.getBlob("filedata");
				   byte[] bytes=blob.getBytes(1,(int)blob.length());
					fos.write(bytes);
					fos.flush();
					fos.close();
					System.out.println("files saves at :"+file.getCanonicalPath());
					
				}
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	private static int getBytes(int i, long length) {
		// TODO Auto-generated method stub
		return 0;
	}

}
