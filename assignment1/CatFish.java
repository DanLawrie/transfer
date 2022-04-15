package edu.monmouth.assignment1;

public class CatFish extends Fish {
	private double whiskerSize;// whisker size in centimeters
CatFish(String color, double whiskerSize){
	super(color);
	setWhiskerSize(whiskerSize);
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
 * returns whisker size
 */
	public double getWhiskerSize() {
		return whiskerSize;
	}
/*
 * sets whisker Size to what is in the parameter
 */
	public void setWhiskerSize(double whiskerSize) {
		this.whiskerSize = whiskerSize;
	}
	
	// returns color and whisker size
	public String toString() {
		return "Color: " + getColor() + "\n Whisker Size: "+ whiskerSize + "cm";
	}
	
	
}
