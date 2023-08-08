package Task1.lsp;

import Task1.ocp.Discount;
import Task1.srp.Product;

import java.util.ArrayList;
import java.util.List;

// Liskov Substitution Principle (LSP)
public class ShoppingCart {
  private List<Product> items = new ArrayList<>();

  public void addProduct(Product product) {
    items.add(product);
  }

  public double calculateTotal(Discount discountStrategy) {
    double total = 0;
    for (Product item : items) {
      total += item.getPrice();
    }
    return discountStrategy.applyDiscount(total);
  }
}
