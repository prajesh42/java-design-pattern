package com.prajesh.patterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing chicken piza...");
	}

	@Override
	public void bake() {
		System.out.println("Baking chicken piza...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting chicken piza...");
	}

}
