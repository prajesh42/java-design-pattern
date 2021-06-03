package com.prajesh.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {

	Map<String, Shape> shapes = new HashMap<>();

	public Shape returnShape(String shape) {
		Shape shapeObj = null;
		if (shapes.containsKey(shape)) {
			shapeObj = shapes.get(shape);
		} else {
			if (shape.equalsIgnoreCase("circle")) {
				shapeObj = new Circle();
			} else if (shape.equalsIgnoreCase("rectangle")) {
				shapeObj = new Rectangle();
			}
			shapes.put(shape, shapeObj);
		}
		return shapeObj;
	}
}
