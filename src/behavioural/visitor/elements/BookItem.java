package behavioural.visitor.elements;

import behavioural.visitor.visitors.ShoppingCartVisitor;

public class BookItem implements ShoppingCartItem {
  String title;
  double price;

  public BookItem(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

}
