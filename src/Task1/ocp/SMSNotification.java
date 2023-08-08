package Task1.ocp;

import Task1.dip.Notification;

public class SMSNotification implements Notification {
  @Override
  public void sendNotification(String message) {
    System.out.println("SMS notification sent: " + message);
  }
}
