package edu.monmouth.assignment1;

public class Fish implements Animal{
	protected String color = "";
	
	
	/*
	 * accepts a String and sets color to that String
	 */
	Fish(String color){
		setColor(color);
	}
	
	//prints out how the fish has moved as a String
	@Override
	public void move() {
		System.out.println(Constants.FISHMOTION);
	}
	
	
	//prints out a fish noise from the fish
	@Override
	public void makeSound() {
		System.out.println(Constants.FISHNOISE);
	}
	//gets the color and returns it
	public String getColor() {
		return color;
	}
	// sets the color to what is in the paramter
	public void setColor(String color) {
		this.color = color;
	}
	// returns color
	public String toString() {
		return "Color: " + getColor();
	}
	
}
