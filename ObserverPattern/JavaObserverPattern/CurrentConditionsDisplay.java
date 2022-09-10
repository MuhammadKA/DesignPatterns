package JavaObserverPattern;

import java.util.Observable;
import java.util.Observer;

import MyObserverPattern.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.humidity = weatherData.getHumidity();
			this.temperature = weatherData.getTemperature();
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("--> Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
