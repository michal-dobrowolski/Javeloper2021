package com.company.weather;

import java.util.HashMap;
import java.util.Map;

import com.company.mail.CompanyMailProvider;
import com.company.mail.interfaces.MailProvider;
import com.company.weather.interfaces.WeatherConnector;

public class WeatherProviderUtilsCommonHelper {

	private WeatherConnector weatherConnector = new WeatherProvider();
	private MailProvider mailProvider = new CompanyMailProvider();
	private Map<String, Weather> cacheWeather = new HashMap<>();

	public Weather checkWeatherAndSendMailWithTemperature(String location) {

		try {
			String[] weatherData = weatherConnector.weather(location);

			Weather weather = new Weather(weatherData[0], weatherData[1], Double.parseDouble(weatherData[2]));

			cacheWeather.put(location, weather);
			Weather weatherToSend = cacheWeather.get(location);

			mailProvider.sendMail(weatherToSend.getLocation(), weatherToSend.getDatum(), String.valueOf(weatherToSend.getTemp()));

			return weather;
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getMessage());
		}

	}

}
