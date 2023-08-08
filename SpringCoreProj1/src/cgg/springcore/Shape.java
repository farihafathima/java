package cgg.springcore;

public interface Shape {
	public void draw();

}


/*Coding to Interface
 * Instead of having an instance of Bean directly what you do is you have an interface and then you use the interface and not the Bean
 * inside the Application Class.
 * 
 * 
 * The advantage is drawing application class Does not have to know weather its calling the draw method of triangle or any other shape it just works on the interface
 * 
 * 
 * code to interface and not to specific implementation 
 * 
 * the drawing application doesnot know eeather it is drawing a circle or triangle or any other shape all it knows is that it is getting a bean which implements the shape interface and 
 * its calling a method of shape interface.
 * 
 * In future if a new class rectangle is added and as long as it implements the shape interface you just create the class and add configuration and call it as shape 
 * 
 * 
 * shape has been defined as a triangle in this instance you can later modify it and add new implementations of the shape interface and all you need to do is to change the just the class in the configuration
 *and modify the properties
 *
 * then the drawing application is going to draw a different Shape Which where not event there this application was first coded
 * 
 * and all this is happening beacuse you are just concerned with the methods of the interface itself and not the methods of individual objects
 * that implement the object.
 * 
 * 
 * this is the main advantage of coding to interface and what thos translate to is in your application 
 * 
 * normally you would have say bussiness services doa layer 
 * instead of having a view layer directly call a bussiness service object what you would do is you would have an interface
 * for the bussiness service than you would call the methods of that interface then the implementation would be later plugged in with the specific business service implementation.
 * that you have coded.
 * if you want to change it later you dont have to chnage the view layer for example you have to just add the new business service implementation then re wire it in your spring.xml
 * 
 * when ever you are doing dependency injection always use interface so that if you change the implenetation you dont have to change the actual class which depends on this interface.
 * you just have to plugin new implementation and change the wiring so that the class can use the new implementation.
 * 
 * 
 
 * */
