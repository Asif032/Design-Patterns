package behavioural.visitor.visitors;

import behavioural.visitor.elements.BookItem;
import behavioural.visitor.elements.FoodItem;

public interface ShoppingCartVisitor {
  double visit(BookItem bookItem);
  double visit(FoodItem foodItem);
}
