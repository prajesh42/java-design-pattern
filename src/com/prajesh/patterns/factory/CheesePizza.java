package com.prajesh.patterns.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing cheese piza...");
	}

	@Override
	public void bake() {
		System.out.println("Baking cheese piza...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting cheese piza...");
	}

}
