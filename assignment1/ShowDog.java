package edu.monmouth.assignment1;

public class ShowDog extends Dog{
	private String breed;
	/*
	 * Calls super class and puts in a furColor string to Constructor and sets bread to parameter
	 */
	ShowDog(String furColor, String breed){
		super(furColor);
		setBreed(breed);
	}
	/*
	 * gets a String called bread
	 */
	
	
	public String getBreed() {
		return breed;
	}
	/*
	 * sets bread to what is in the String parameters
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/*
	 * prints out you have moved everytime method is called
	 */
	@Override
	public void move(){
		System.out.println(Constants.DOGMOTION);
	}
	/*
	 * prints out what is in bark when the method is called
	 */
	@Override
	public void makeSound() {
		System.out.println(Constants.BARK);
	}
	
	/*
	 * returns string with fur color and breed
	 */
	public String toString() {
		return "Fur color: " + getFurColor() + "\nBreed: " + getBreed();
		
	}

}