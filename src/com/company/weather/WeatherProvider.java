package com.company.weather;

import java.util.concurrent.ThreadLocalRandom;

import com.company.weather.interfaces.WeatherConnector;

public class WeatherProvider implements WeatherConnector {

	@Override
	public String[] weather(String location) {
		String[] weather = new String[]{"Sunny", "Rainy", "Foggy", "Snowy", "Freezing", "Hot"};
		return new String[]{location, weather[ThreadLocalRandom.current().nextInt(0, 6)], String.valueOf(ThreadLocalRandom.current().nextInt(-5, 30))};
	}

}
