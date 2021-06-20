package com.prajesh.patterns.decorator;

public class CheesePizzaDecorator implements Pizza{

	Pizza pizza;
	
	public CheesePizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
		System.out.println("Adding cheese topings");
	}
	
}
