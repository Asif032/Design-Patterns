package behavioural.state.states;

import behavioural.state.context.PackageContext;

public class OrderedState implements PackageState {
  @Override
  public void next(PackageContext context) {
    System.out.println("Package is in ordered state.");
    context.setCurrentState(new OutForDeliveryState());
  }
}
