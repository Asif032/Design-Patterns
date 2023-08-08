package Task1.srp;

import Task1.dip.Notification;

public class EmailNotification implements Notification {
  @Override
  public void sendNotification(String message) {
    System.out.println("Email notification sent: " + message);
  }
}
