package JavaObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public void measurementChanged() {
		setChanged();
		// We don't send a data object with notifyObservers(), which means we are using
		// "pull" model.
		notifyObservers();
	}

	// This method plays the role of the actual weather station so that we can test
	// our code
	public void setMeasurement(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
}
