package tasks.task1_solid;

import tasks.task1_solid.dip.Notification;
import tasks.task1_solid.isp.InStoreOrder;
import tasks.task1_solid.isp.OnlineOrder;
import tasks.task1_solid.isp.Orderable;
import tasks.task1_solid.lsp.ShoppingCart;
import tasks.task1_solid.ocp.OrderProcessor;
import tasks.task1_solid.ocp.SMSNotification;
import tasks.task1_solid.srp.EmailNotification;
import tasks.task1_solid.srp.Product;

public class Main {
  public static void main(String[] args) {
    // Create products
    Product laptop = new Product("Laptop", 1000);
    Product phone = new Product("Phone", 500);

    // Create shopping cart
    ShoppingCart cart = new ShoppingCart();
    cart.addProduct(laptop);
    cart.addProduct(phone);

    // Create orders
    Orderable onlineOrder = new OnlineOrder(cart);
    Orderable inStoreOrder = new InStoreOrder(cart);

    // Create notifications
    Notification emailNotification = new EmailNotification();
    Notification smsNotification = new SMSNotification();

    // Create order processors with different notification methods
    OrderProcessor emailOrderProcessor = new OrderProcessor(emailNotification);
    OrderProcessor smsOrderProcessor = new OrderProcessor(smsNotification);

    // Process orders with different notification methods
    emailOrderProcessor.processOrder(onlineOrder);
    smsOrderProcessor.processOrder(inStoreOrder);
  }
}

