package cgg.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements Shape{
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
//	List<Point> points;
	private ApplicationContext context;
	
	

	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		System.out.println("Dtrawing Triangle");
		System.out.println("Point A= ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B= ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("PointC= ("+getPointC().getX()+","+getPointC().getY()+")");
		
//		for(Point point:points) {
//			System.out.println("Point= ("+point.getX()+","+point.getY()+")");
//		}

	}
	
//	public void myInit() {
//		System.out.println("My init method called for init method");
//	}
////	
//	public void cleanUp() {
//		System.out.println("my CleanUp method called for Triangle ");
//	}
	
//Autowiring is a feature provided by spring frame work that helps us to skip some of the configuration that we have to do
//Ever member variable in the Spring bean has to be Configured if it is actually a reference to a another bean
//you have specify the reference explicitly 
//Auto wiring helps us in reducing some of the configurations by intelligently guessing the references.
//In spring.xml we have to mention the dependency by writing three different property tag.
	//there is shortcut here by using auto wiring if the name of the bean is same as the name of the member variable.We can ask 
	//spring tho auto wire based on name.
	//the way to do this is by writing a tag auto wire ="byName"
	//It checks for all the member variables of this bean andsee if ther is any bean with this name defined in spring.xml.
	//if it finds a bean like that its going to automatically reference this bean to the member variable.



	
	
	




//@Override
//public void afterPropertiesSet() throws Exception {
//	System.out.println("Intializing bean init method called for triangle");
//	
//}
//
//
//
//@Override
//public void destroy() throws Exception {
//	System.out.println("Disposable Bean destroy method called for Triangle");
//	
//}
	
//Another way of autowire is byType
//this works if have only one memeber variable and one bean of each type
//foe example there is only one point object and ther is only one bean thats defined in the xml of type particular class
//in that case ehat spring dose is it looks foe type even though the bean has beaan defined with adifferent name
	//it looks for the type which is the class for which 
	
	


}
