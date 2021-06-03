package com.prajesh.patterns.flyweight;

public class Rectangle extends Shape {

	private String label;
	
	public Rectangle() {
		this.label="Rectangle";
	}

	@Override
	public void drawRectangle(int length,int breadth,String fillType) {
		System.out.println("Draw "+label+" of length "+length+", breadth "+breadth+" and fillType "+fillType);

	}

}
