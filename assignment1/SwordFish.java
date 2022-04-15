package edu.monmouth.assignment1;

public class SwordFish extends Fish{
	//size of fish in inches
	private int size = 0;
	/*
	 * calls super and sets color with parameter. Also sets size using it's parameter
	 */
	SwordFish(String color, int size){
		super(color);
		setSize(size);
	}
	/*
	 * returns size of the fish
	 */
	public int getSize() {
		return size;
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
	/*
	 * sets the size to the parameter
	 */
	public void setSize(int size) {
		this.size = size;
	}
	// returns color and size
	public String toString() {
		return "Color: " + getColor() + "\n Fish size: "+ getSize() + "inches";
	}

}
