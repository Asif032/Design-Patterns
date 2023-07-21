package behavioural.state.context;

import behavioural.state.states.OrderedState;
import behavioural.state.states.PackageState;

public class PackageContext {
  PackageState currentState;

  public PackageContext() {
    this.currentState = new OrderedState();
  }
  public void setCurrentState(PackageState state) {
    this.currentState = state;
  }

  public void processOrder() {
    currentState.next(this);
  }
}
