package tasks.task1_solid.srp;

import tasks.task1_solid.dip.Notification;

public class EmailNotification implements Notification {
  @Override
  public void sendNotification(String message) {
    System.out.println("Email notification sent: " + message);
  }
}
