package com.prajesh.patterns.decorator;

public class VegPizzaDecorator implements Pizza{

	Pizza pizza;
	
	public VegPizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
		System.out.println("Adding veg topings");
	}
	
}
