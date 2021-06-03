package com.prajesh.patterns.flyweight;

public class DrawShape {

	public static void drawShape(int numberOfShapes) {

		FlyWeight flyWeight=null;
		
		for (int i = 1; i <= numberOfShapes; i++) {
			Shape shape=null;
			if (i % 2 == 0) {
				flyWeight=new FlyWeight();
				shape=flyWeight.returnShape("circle");
				shape.drawCircle(i,"Blue", "Red");
			} else {
				flyWeight=new FlyWeight();
			    shape=flyWeight.returnShape("rectangle");
			    shape.drawRectangle(i+i,i,"Green");
			}
		}

	}

	public static void main(String[] args) {
		DrawShape.drawShape(5);
	}
}
