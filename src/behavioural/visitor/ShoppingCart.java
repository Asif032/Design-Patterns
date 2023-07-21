package behavioural.visitor;

import behavioural.visitor.elements.ShoppingCartItem;
import behavioural.visitor.visitors.ShoppingCartVisitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  List<ShoppingCartItem> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void addItem(ShoppingCartItem item) {
    items.add(item);
  }

  public void removeItem(ShoppingCartItem item) {
    items.remove(item);
  }

  public double calculateTotal(ShoppingCartVisitor visitor) {
    double total = 0.0;
    for (ShoppingCartItem item : items) {
      total += item.accept(visitor);
    }
    return total;
  }
}
