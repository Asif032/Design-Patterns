package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
  double temperature;
  List<Observer> observers;

  public WeatherStation() {
    observers = new ArrayList<>();
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
    notifyAllObservers();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyAllObservers() {
    for (Observer observer : observers) {
      observer.update(temperature);
    }
  }
}
