package edu.monmouth.shape;

public class Rectangle implements Shape{
	private int length = 0;
	private int width = 0;
	
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	@Override public double area() {
		double area = length * width;
		return area;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
