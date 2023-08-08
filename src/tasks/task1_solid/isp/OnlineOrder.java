package tasks.task1_solid.isp;

import tasks.task1_solid.lsp.ShoppingCart;
import tasks.task1_solid.ocp.TenPercentDiscount;

public class OnlineOrder implements Orderable {
  private ShoppingCart cart;

  public OnlineOrder(ShoppingCart cart) {
    this.cart = cart;
  }

  @Override
  public void placeOrder() {
    double total = cart.calculateTotal(new TenPercentDiscount());
    System.out.println("Online order placed. Total: " + total);
  }
}
