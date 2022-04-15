package edu.monmouth.shape;

public class SingletonRectangle extends Rectangle {
	SingletonRectangle instance;
	SingletonRectangle(int length, int width){
		super(length, width);
	}
	public SingletonRectangle getInstance() {
		return instance;
	}
	
}
