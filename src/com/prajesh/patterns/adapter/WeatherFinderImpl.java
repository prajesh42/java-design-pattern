package com.prajesh.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int findWeather(String city) {
		for(CityTemperature ct:CityTemperature.values()) {
			String cityTemp=String.valueOf(ct);
			if(city.equals(cityTemp)) {
				return ct.temperature;
			}
		}
		return 0;
		
	}

}
