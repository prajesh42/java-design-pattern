package com.prajesh.patterns.decorator;

public class ChickenPizzaDecorator implements Pizza{

	Pizza pizza;
	
	public ChickenPizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
		System.out.println("Adding chicken topings");
	}
	
}
