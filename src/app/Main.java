package app;

import data.WeatherData;
import observers.CurrentConditionDisplay;
import observers.ForecastDisplay;
import observers.PressureDisplay;
import observers.StadisticsDisplay;
import observers.ThirdPartDisplay;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StadisticsDisplay statisticsDisplay = new StadisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		ThirdPartDisplay thirdPartDisplay = new ThirdPartDisplay(weatherData);
		PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

		weatherData.setMeasurements(27, 65, 30.4f);
		weatherData.setMeasurements(28, 70, 29.2f);
		weatherData.setMeasurements(26, 90, 29.2f);
	}
}
