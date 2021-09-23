package com.company.weather;

import java.util.concurrent.ThreadLocalRandom;

public class WeatherClient {

	static final String[] LOCATIONS = new String[]{"Cracow", "Warsaw", "London", "Lodz", "Kielce", "Tokyo", "NewYork", "Buenos Aires", "Rzeszow"};

	public static void invoke() {
		Runnable task = () -> {
			WeatherProviderUtilsCommonHelper provider = new WeatherProviderUtilsCommonHelper();
			int maxIndex = LOCATIONS.length;
			String location = LOCATIONS[ThreadLocalRandom.current().nextInt(0, maxIndex)];

			log(location);

			Weather weather = provider.checkWeatherAndSendMailWithTemperature(location);

			log(weather);
		};

		for (int i = 0; i < LOCATIONS.length * 20 ; i++) {
			task.run();
		}
	}

	private static void log(Object object) {
		System.out.println("Weather=" + object.toString());
	}

}
