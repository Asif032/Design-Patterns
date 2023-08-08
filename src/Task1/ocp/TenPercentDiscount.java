package Task1.ocp;

public class TenPercentDiscount implements Discount {
  @Override
  public double applyDiscount(double price) {
    return price * 0.9;
  }
}
