package behavioural.state;

import behavioural.state.context.PackageContext;

public class Main {
  public static void main(String[] args) {
    PackageContext context = new PackageContext();

    context.processOrder();
    context.processOrder();
    context.processOrder();
  }
}
