package com.prajesh.patterns.flyweight;

public class Circle extends Shape {

	private String label;
    
    public Circle() {
    	this.label="Circle";
    }
    
	@Override
	public void drawCircle(int radius,String color, String borderColor) {
	    System.out.println("Draw "+label+" of radius "+radius+", color "+color+" and border color "+borderColor);

	}

}
