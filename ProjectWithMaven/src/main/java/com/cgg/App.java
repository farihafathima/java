package com.cgg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program created" );
       Configuration cfg= new Configuration();
    		   cfg.configure();
    		   SessionFactory factory =cfg.buildSessionFactory();
//       System.out.println(factory);
//       System.out.println(factory.isClosed());
    		   
    		   //creating student object
				Student student = new Student();
				student.setId(4);
				student.setName("lmn");
				student.setCity("ppt");
				
				
				//creating Address object
				Address ad = new Address();
				ad.setStreet("street1");
				ad.setCity("Hyd");
				ad.setOpen(true);
				ad.setX(12.456);
				ad.setAdddedDate(new Date());
				
				
				//reading image file and storing in database
				try {
					FileInputStream fis= new FileInputStream("src/main/java/online.jpeg");
					byte [] data=new byte[fis.available()];
					fis.read(data);
					ad.setImage(data);
					fis.close();
				}catch(FileNotFoundException e) {
					System.out.println(e);
				}
				
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
    		   Session session=factory.openSession();
    		   //write the code here
    		   
    		   //session.beginTransaction();
    		   Transaction tx=session.beginTransaction();
    		   session.save(student);
    		   session.save(ad);
    		   tx.commit();
    		   //session.getTransaction().commit();
    		   
    		   
    		   
    		   
    		   session.close();
    		   factory.close();
    		   System.out.println("Done......");
       
    }
}
