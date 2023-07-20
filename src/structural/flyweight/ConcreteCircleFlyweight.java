package structural.flyweight;

public class ConcreteCircleFlyweight implements CircleFlyweight {
  private String color;

  public ConcreteCircleFlyweight(String color) {
    this.color = color;
  }
  @Override
  public void draw(int x, int y) {
    System.out.println("Drawing circle of color " + color + "at position (" + x + ", " + y + ")");
  }
}
