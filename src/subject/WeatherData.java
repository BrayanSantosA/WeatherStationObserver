package subjects;

public class WeatherData implements Subject{
	

	public void registerObserver() {
		System.out.println("Suscribete para recibir notificaciones");
		
	}

	public void removeObserver() {
		System.out.println("Desuscribete si ya no quieres recibir información");
		
	}

	public void notifyObservers() {
		System.out.println("Hay una nueva notificación del clima");
		
	}
	
	public float getTemperature() {
		return 0;
	}
	
	public float getHumidity() {
		return 0;
	}
	public float getPressure() {
		return 0;
	}
	
	public void meassurementsChanged(){
		float temp= getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
	}
	
	
}
