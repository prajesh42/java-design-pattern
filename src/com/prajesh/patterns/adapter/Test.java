package com.prajesh.patterns.adapter;

public class Test {

	public static void main(String[] args) {
		WeatherUI wu=new WeatherUI();
		int findWeather = wu.findWeather(700156);
		System.out.println(findWeather+"o C");
	}
}
