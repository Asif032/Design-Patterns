package tasks.task1_solid.ocp;

import tasks.task1_solid.dip.Notification;
import tasks.task1_solid.isp.Orderable;

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
