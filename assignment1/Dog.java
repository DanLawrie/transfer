package edu.monmouth.assignment1;

	public class Dog implements Animal{
		protected String furColor = "";
		
		
		
		/*
		 * accepts in a String and sets that string to the fur color
		 */
		Dog(String furColor){
			setFurColor(furColor);
		}
		
		
		/*
		 * this returns a string that is called fur color
		 */
		public String getFurColor() {
			return furColor;
		}
		
		/*
		 * accepts a string and sets the fur color to the string parameter
		 */
		public void setFurColor(String furColor) {
			this.furColor = furColor;
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
		 * returns a string with the fur color
		 */
		public String toString() {
			return "fur color: " + getFurColor();
			
		}
	
	}