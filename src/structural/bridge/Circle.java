package structural.bridge;

public class Circle extends Shape {
  private int radius;

  public Circle(int radius, Color color) {
    super(color);
    this.radius = radius;
  }

  @Override
  void drawShape() {
    System.out.print("Drawing a circle with radius " + radius + " and ");
    color.applyColor();
  }
}
