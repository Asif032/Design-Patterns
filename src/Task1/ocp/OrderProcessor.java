package Task1.ocp;

import Task1.dip.Notification;
import Task1.isp.Orderable;

public class OrderProcessor {
  private Notification notification;

  public OrderProcessor(Notification notification) {
    this.notification = notification;
  }

  public void processOrder(Orderable order) {
    order.placeOrder();
    notification.sendNotification("Your order has been processed.");
  }
}
