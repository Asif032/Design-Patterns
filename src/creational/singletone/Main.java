package creational.singletone;

public class Main {
  public static void main(String[] args) {
    DatabaseConnection connection = DatabaseConnection.getInstance();
    connection.connect();
  }
}
