package com.prajesh.patterns.adapter;

public class WeatherUI{

	public int findWeather(int zipCode) {
		WeatherAdapter wa=new WeatherAdapter();
		return wa.findWeather(zipCode);
	}

}
