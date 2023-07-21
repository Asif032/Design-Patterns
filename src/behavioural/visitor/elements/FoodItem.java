package behavioural.visitor.elements;

import behavioural.visitor.visitors.ShoppingCartVisitor;

public class FoodItem implements ShoppingCartItem {
  private String name;
  private double weight;
  private double pricePerKg;

  public FoodItem(String name, double weight, double pricePerKg) {
    this.name = name;
    this.weight = weight;
    this.pricePerKg = pricePerKg;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getPricePerKg() {
    return pricePerKg;
  }

  public double getPrice() {
    return pricePerKg * weight;
  }

  @Override
  public double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

}
