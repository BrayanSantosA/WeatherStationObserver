package observers;
import data.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		Display();
	}
	
	public void Display() {
		System.out.println("Condiciones actuales: " + temperature + "C y " + humidity + "% de humedad");
	}

}