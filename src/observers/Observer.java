package observers;
import subject.Subject;

public interface Observer {

	public void update(float temperature, float humidity, float pressure);
}
