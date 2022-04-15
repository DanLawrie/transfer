package edu.monmouth.shape;

public class Circle implements Shape {
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
		
	}
@Override public double area() {
	
	double area = Math.PI * Math.pow(radius, 2);
	return area;	
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
