package edu.monmouth.shape;

public class Main {

	public static void main(String[] args) {
	Circle circle = new Circle(12);
	Rectangle rectangle = new Rectangle(21, 34);
	Shape shape1 = new Circle(90);
	Shape shape2 = new Rectangle(2,4);
	System.out.println(circle.area());
	System.out.println(rectangle.area());
	System.out.println(shape1.area());
	System.out.println(shape2.area());
	}

}
