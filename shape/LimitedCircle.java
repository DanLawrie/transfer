package edu.monmouth.shape;

public class LimitedCircle extends Circle {
	
	private static int numberOfInstances = 0;
	LimitedCircle() {
		super(0);
		numberOfInstances++;
	} 
	public int getNumberOfInstances() {
		return numberOfInstances;
	}
}
