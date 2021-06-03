package com.prajesh.patterns.adapter;

public  class WeatherAdapter {

	public int findWeather(int zipCode) {
		WeatherFinder wf=new WeatherFinderImpl();
		int findWeather=0;
		for(CityZip cz:CityZip.values()) {
			if(cz.zipCode==zipCode) {
				String city = String.valueOf(cz);
				findWeather = wf.findWeather(city);
				break;
			}
		}
		return findWeather;
	}
}
