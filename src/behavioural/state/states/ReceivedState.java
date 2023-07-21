package behavioural.state.states;

import behavioural.state.context.PackageContext;

public class ReceivedState implements PackageState {

  @Override
  public void next(PackageContext context) {
    System.out.println("Package is in received state. No next state exists.");
  }
}
