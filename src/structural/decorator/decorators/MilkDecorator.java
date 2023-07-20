package structural.decorator.decorators;

import structural.decorator.components.Coffee;

public class MilkDecorator extends CoffeeDecorator {

  public MilkDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Milk";
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.5;
  }
}
