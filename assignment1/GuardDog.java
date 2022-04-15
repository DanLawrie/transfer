package edu.monmouth.assignment1;

public class GuardDog extends Dog{
	private short meanness = 0;
	
	//creates gaurd dog and sets meanness
	GuardDog(String furColor, short meanness){
		super(furColor);
		setMeanness(meanness);
	}
	
	//returns the meanness of the Dog
	public short getMeanness() {
		return meanness;
	}
	//sets the meanness of the dog to what is in the parameter
	public void setMeanness(short meanness) {
		this.meanness = meanness;
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
	
	//returns fur color and meanness
	public String toString() {
		
			return "Fur Color: " + getFurColor() + "\nMeanness: " + getMeanness();
	}
}
