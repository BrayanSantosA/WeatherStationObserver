package observers;
import data.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private float heatIndex;
	private WeatherData weatherData;

	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.heatIndex = computeHeatIndex(temperature, humidity);
		Display();
	}

	public float computeHeatIndex(float t, float rh) {
		float c1 = -8.78469475556f;
		float c2 = 1.61139411f;
		float c3 = 2.33854883889f;
		float c4 = -0.14611605f;
		float c5 = -0.012308094f;
		float c6 = -0.0164248277778f;
		float c7 = 2.211732e-3f;
		float c8 = 7.2546e-4f;
		float c9 = -3.582e-6f;

		float hi = c1 + (c2 * t) + (c3 * rh) + (c4 * t * rh)
				+ (c5 * t * t) + (c6 * rh * rh)
				+ (c7 * t * t * rh) + (c8 * t * rh * rh)
				+ (c9 * t * t * rh * rh);

		return hi;
	}

	public void Display() {
		System.out.println("Indice de calor actual: " + heatIndex + "C");
	}
}