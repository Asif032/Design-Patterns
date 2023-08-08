package tasks.task1_solid.ocp;

import tasks.task1_solid.dip.Notification;

public class SMSNotification implements Notification {
  @Override
  public void sendNotification(String message) {
    System.out.println("SMS notification sent: " + message);
  }
}
