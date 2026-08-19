package observers;
import data.WeatherData;

public class PressureDisplay implements Observer, DisplayElement {

	private float pressure;
	private WeatherData weatherData;

	public PressureDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		Display();
	}
	
	public void Display() {
		System.out.println("Presion atmosferica actual: " + pressure + " hPa");
	}
}
