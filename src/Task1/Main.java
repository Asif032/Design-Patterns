package Task1;

import Task1.dip.Notification;
import Task1.isp.InStoreOrder;
import Task1.isp.OnlineOrder;
import Task1.isp.Orderable;
import Task1.lsp.ShoppingCart;
import Task1.ocp.OrderProcessor;
import Task1.ocp.SMSNotification;
import Task1.srp.EmailNotification;
import Task1.srp.Product;

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

