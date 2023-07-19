package creational.factory;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.createShape("circle");
    circle.draw();

    Shape triangle = shapeFactory.createShape("triangle");
    triangle.draw();

    Shape rectangle = shapeFactory.createShape("rectangle");
    rectangle.draw();
  }
}
