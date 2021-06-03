package com.prajesh.patterns.adapter;

public enum CityTemperature {

	kolkata(28),
	delhi(24),
	shimla(16),
	mumbai(29);
	
	public final Integer temperature;
	
	private CityTemperature(int temp) {
		this.temperature=temp;
	}
}
