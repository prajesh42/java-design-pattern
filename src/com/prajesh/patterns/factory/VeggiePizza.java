package com.prajesh.patterns.factory;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing veggie piza...");
	}

	@Override
	public void bake() {
		System.out.println("Baking veggie piza...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting veggie piza...");
	}

}
