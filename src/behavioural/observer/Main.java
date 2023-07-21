package behavioural.observer;

public class Main {
  public static void main(String[] args) {
    Observer phone = new Phone();
    Observer tv = new TV();

    WeatherStation weatherStation = new WeatherStation();
    weatherStation.addObserver(phone);
    weatherStation.addObserver(tv);

    weatherStation.setTemperature(35);
    weatherStation.setTemperature(38);
  }
}
