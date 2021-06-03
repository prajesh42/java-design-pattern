package com.prajesh.patterns.flyweight;

public class DrawShape {

	public void drawShape(int numberOfShapes) {
		Shape[] shapes = new Shape[numberOfShapes + 1];

		for (int i = 1; i <= numberOfShapes; i++) {
			if (i % 2 == 0) {
				shapes[i] = new Circle();
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setBorderColor("Red");
				((Circle) shapes[i]).setColor("Blue");
				shapes[i].draw();
			} else {
				shapes[i] = new Rectangle();
				((Rectangle) shapes[i]).setLength(i + i);
				((Rectangle) shapes[i]).setBreadth(i);
				((Rectangle) shapes[i]).setFillType("Green");
				shapes[i].draw();
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		DrawShape drawShape = new DrawShape();
		drawShape.drawShape(5);
	}
}
