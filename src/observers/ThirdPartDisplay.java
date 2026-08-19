package observers;
import data.WeatherData;

public class ThirdPartDisplay implements DisplayElement, Observer {

	private WeatherData weatherData;

	public ThirdPartDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void Display() {
		System.out.println("Display: dato personalizado basado en las mediciones");
	}
	
	public void update(float temperature, float humidity, float pressure) {
		Display();
	}
}
