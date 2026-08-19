package observers;
import data.WeatherData;

public class StadisticsDisplay implements Observer, DisplayElement{

	private float maxTemp = Float.MIN_VALUE;
	private float minTemp = Float.MAX_VALUE;
	private float tempSum = 0.0f;
	private int numReadings = 0;
	private WeatherData weatherData;

	public StadisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		tempSum += temperature;
		numReadings++;

		if (temperature > maxTemp) {
			maxTemp = temperature;
		}
		if (temperature < minTemp) {
			minTemp = temperature;
		}
		Display();
	}
	
	public void Display() {
		//Stadistics Display
		System.out.println("Estadisticas: promedio/max/min = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}

