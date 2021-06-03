package com.prajesh.patterns.flyweight;

public class Circle implements Shape {

	private String label;
    private int radius;
    private String color;
    private String borderColor;
    
    public Circle() {
    	this.label="Circle";
    }
    
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	@Override
	public void draw() {
	    System.out.println("Draw "+label+" of radius "+radius+", color "+color+" and border color "+borderColor);

	}

}
