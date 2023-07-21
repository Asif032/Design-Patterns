package behavioural.state.states;

import behavioural.state.context.PackageContext;

public class OutForDeliveryState implements PackageState {
  @Override
  public void next(PackageContext context) {
    System.out.println("Package is in out for delivery state.");
    context.setCurrentState(new ReceivedState());
  }
}
