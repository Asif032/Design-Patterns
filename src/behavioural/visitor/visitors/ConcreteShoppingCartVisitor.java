package behavioural.visitor.visitors;

import behavioural.visitor.elements.BookItem;
import behavioural.visitor.elements.FoodItem;

public class ConcreteShoppingCartVisitor implements ShoppingCartVisitor {
  @Override
  public double visit(BookItem bookItem) {
    return bookItem.getPrice() * 0.9;
  }

  @Override
  public double visit(FoodItem foodItem) {
    return foodItem.getPrice() * 0.95;
  }
}
