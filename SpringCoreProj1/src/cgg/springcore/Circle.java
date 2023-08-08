package cgg.springcore;

public class Circle implements Shape {
	
	
	private Point Center;

	public Point getCenter() {
		return Center;
	}

	public void setCenter(Point center) {
		Center = center;
	}

	@Override
	public void draw() {
		
			System.out.println("Drawing Circle");
			System.out.println("Point Center= ("+getCenter().getX()+","+getCenter().getY()+")");
		
	}

}
