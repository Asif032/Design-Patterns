package behavioural.visitor;

import behavioural.visitor.elements.BookItem;
import behavioural.visitor.elements.FoodItem;
import behavioural.visitor.visitors.ConcreteShoppingCartVisitor;
import behavioural.visitor.visitors.ShoppingCartVisitor;

public class Main {
  public static void main(String[] args) {
    ShoppingCartVisitor visitor = new ConcreteShoppingCartVisitor();

    BookItem book = new BookItem("Design Pattern", 24);
    FoodItem apple = new FoodItem("Apple", 2, 2.5);
    FoodItem orange = new FoodItem("Orange", 1.5, 4);

    ShoppingCart cart = new ShoppingCart();
    cart.addItem(book);
    cart.addItem(apple);
    cart.addItem(orange);

    double totalPrice = cart.calculateTotal(visitor);
    System.out.println("Total price: $" + totalPrice);
  }
}
