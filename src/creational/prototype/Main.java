package creational.prototype;

public class Main {
  public static void main(String[] args) {
    Prototype c1 = new Circle(4.6, "red");
    c1.draw();

    Prototype c2 = c1.clone();
    c2.draw();
  }
}
