package com.prajesh.patterns.decorator;

public class ExtraCheeseDecorator implements Pizza{

	Pizza pizza;
	
	public ExtraCheeseDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
		System.out.println("Adding extra cheese");
	}
	
}
