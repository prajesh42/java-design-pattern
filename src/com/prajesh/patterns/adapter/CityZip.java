package com.prajesh.patterns.adapter;

public enum CityZip {

	kolkata(700156),
	delhi(124516),
	shimla(462021),
	mumbai(542106);
	
	public final Integer zipCode;
	
	private CityZip(int zipCode) {
		this.zipCode=zipCode;
	}
}
