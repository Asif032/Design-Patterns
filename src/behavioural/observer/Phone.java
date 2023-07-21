package behavioural.observer;

public class Phone implements Observer {
  @Override
  public void update(double temperature) {
    System.out.println("Phone display: The temperature is " + temperature + "C");
  }
}
