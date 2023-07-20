package structural.bridge;

public class Main {
  public static void main(String[] args) {
    Shape redCircle = new Circle(5, new RedColor());
    redCircle.drawShape();

    Shape blueSquare = new Square(10, new BlueColor());
    blueSquare.drawShape();
  }
}
