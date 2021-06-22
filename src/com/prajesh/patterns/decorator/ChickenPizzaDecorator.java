package com.prajesh.patterns.decorator;

public class ChickenPizzaDecorator extends PizzaDecorator{

	
	public ChickenPizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding chicken topings");
	}
	
}
