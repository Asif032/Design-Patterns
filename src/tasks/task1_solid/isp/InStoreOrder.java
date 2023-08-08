package tasks.task1_solid.isp;

import tasks.task1_solid.lsp.ShoppingCart;
import tasks.task1_solid.ocp.TenPercentDiscount;

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
