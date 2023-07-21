package behavioural.state.states;

import behavioural.state.context.PackageContext;

public interface PackageState {
  void next(PackageContext context);
}
