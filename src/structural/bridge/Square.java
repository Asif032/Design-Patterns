package structural.bridge;

public class Square extends Shape {
  private int side;

  public Square(int side, Color color) {
    super(color);
    this.side = side;
  }

  @Override
  void drawShape() {
    System.out.print("Drawing a square with side " + side + " and ");
    color.applyColor();
  }
}
