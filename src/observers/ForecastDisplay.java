package observers;
import data.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		Display();
	}
	
	public void Display() {
		//Forecast Display
		System.out.print("Pronostico: ");
		if (currentPressure > lastPressure) {
			System.out.println("Mejora el clima");
		} else if (currentPressure == lastPressure) {
			System.out.println("Clima estable");
		} else {
			System.out.println("Cuidado, clima frio y humedo en camino");
		}
	}

}
