package behavioural.visitor.elements;

import behavioural.visitor.visitors.ShoppingCartVisitor;

public interface ShoppingCartItem {
  double accept(ShoppingCartVisitor visitor);
}
