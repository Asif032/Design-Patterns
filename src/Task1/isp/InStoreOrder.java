package Task1.isp;

import Task1.lsp.ShoppingCart;
import Task1.ocp.TenPercentDiscount;

public class InStoreOrder implements Orderable {
  private ShoppingCart cart;

  public InStoreOrder(ShoppingCart cart) {
    this.cart = cart;
  }

  @Override
  public void placeOrder() {
    double total = cart.calculateTotal(new TenPercentDiscount());
    System.out.println("In-store order placed. Total: " + total);
  }
}
