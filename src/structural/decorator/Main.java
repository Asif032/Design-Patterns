package structural.decorator;

import structural.decorator.components.Coffee;
import structural.decorator.components.SimpleCoffee;
import structural.decorator.decorators.MilkDecorator;
import structural.decorator.decorators.SugarDecorator;

public class Main {
  public static void main(String[] args) {
    SimpleCoffee simpleCoffee = new SimpleCoffee();
    simpleCoffee.getDescription();
    simpleCoffee.getCost();
    System.out.println("Cost: $" + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

    Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
    coffeeWithMilk.getDescription();
    coffeeWithMilk.getCost();
    System.out.println("Cost: $" + coffeeWithMilk.getCost() + ", Description: " + coffeeWithMilk.getDescription());

    Coffee coffeeWithSugar = new SugarDecorator(simpleCoffee);
    coffeeWithSugar.getDescription();
    coffeeWithSugar.getCost();
    System.out.println("Cost: $" + coffeeWithSugar.getCost() + ", Description: " + coffeeWithSugar.getDescription());

    Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
    coffeeWithMilkAndSugar.getDescription();
    coffeeWithMilkAndSugar.getCost();
    System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost() + ", Description: " + coffeeWithMilkAndSugar.getDescription());
  }
}
