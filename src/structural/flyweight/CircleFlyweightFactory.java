package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFlyweightFactory {
  private Map<String, CircleFlyweight> circleFlyweights;

  public CircleFlyweightFactory() {
    circleFlyweights = new HashMap<>();
  }

  public CircleFlyweight getCircleFlyweight(String color) {
    if (!circleFlyweights.containsKey(color)) {
      CircleFlyweight flyweight = new ConcreteCircleFlyweight(color);
      circleFlyweights.put(color, flyweight);
    }
    return circleFlyweights.get(color);
  }
}
