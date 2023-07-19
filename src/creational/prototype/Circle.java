package creational.prototype;

public class Circle implements Prototype {

  double radius;
  String color;

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public Circle(Circle c) {
    if (c != null) {
      this.radius = c.radius;
      this.color = c.color;
    }
  }
  @Override
  public void draw() {
    System.out.println("Color : " + color + "\n" + "Radius : " + radius);
  }

  @Override
  public Prototype clone() {
    return new Circle(this);
  }
}
