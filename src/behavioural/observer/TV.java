package behavioural.observer;

public class TV implements Observer {
  @Override
  public void update(double temperature) {
    System.out.println("TV display: The temperature is " + temperature + "C");
  }
}
