package com.company.weather;

class Weather {

	private String location;
	private String datum;
	private double temp;

	public Weather(String location, String datum, double temp) {
		this.location = location;
		this.datum = datum;
		this.temp = temp;
	}

	public String getLocation() {
		return location;
	}

	public String getDatum() {
		return datum;
	}

	public double getTemp() {
		return temp;
	}

	@Override
	public String toString() {
		return "Weather{" +
				"location='" + location + '\'' +
				", datum=" + datum + '\'' +
				", temp=" + temp +
				'}';
	}

}
