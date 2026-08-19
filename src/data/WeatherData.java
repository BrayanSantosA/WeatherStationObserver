package data;
import subject.Subject;
import observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;

	public void registerObserver(Observer o) {
		System.out.println("Suscribete para recibir notificaciones");
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		System.out.println("Desuscribete si ya no quieres recibir información");
		observers.remove(o);
	}

	public void notifyObservers() {
		System.out.println("Hay una nueva notificación del clima");
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
	public void meassurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		meassurementsChanged();
	}
	
	
}