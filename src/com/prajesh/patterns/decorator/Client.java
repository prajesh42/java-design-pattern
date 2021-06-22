package com.prajesh.patterns.decorator;

public class Client {

	public static void main(String[] args) {
		Pizza pizza=new CheesePizzaDecorator(new PlainPizza());
	    pizza.bake();
	    
	    Pizza pizza1=new ChickenPizzaDecorator(new VegPizzaDecorator(new PlainPizza()));
	    pizza1.bake();
	
	}
}
