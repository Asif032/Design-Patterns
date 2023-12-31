package creational.factory;

public class ShapeFactory {
  public Shape createShape(String type) {
    if (type.equalsIgnoreCase("circle")) {
      return new Circle();
    } else if (type.equalsIgnoreCase("triangle")) {
      return new Triangle();
    } else if (type.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    }
    throw new IllegalArgumentException("Invalid shape type : " + type);
  }
}
