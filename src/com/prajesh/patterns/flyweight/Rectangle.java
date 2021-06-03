package com.prajesh.patterns.flyweight;

public class Rectangle implements Shape {

	private String label;
	private int length;
	private int breadth;
	private String fillType;
	
	public Rectangle() {
		this.label="Rectangle";
	}
	
	
	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}



	public String getFillType() {
		return fillType;
	}



	public void setFillType(String fillType) {
		this.fillType = fillType;
	}



	@Override
	public void draw() {
		System.out.println("Draw "+label+" of length "+length+", breadth "+breadth+" and fillType "+fillType);

	}

}
