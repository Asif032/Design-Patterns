package structural.flyweight;

public class Main {
  public static void main(String[] args) {
    CircleFlyweightFactory flyweightFactory = new CircleFlyweightFactory();

    CircleFlyweight redCircle = flyweightFactory.getCircleFlyweight("red");
    CircleFlyweight greenCircle = flyweightFactory.getCircleFlyweight("green");
    CircleFlyweight blueCircle = flyweightFactory.getCircleFlyweight("blue");

    redCircle.draw(10, 20);
    greenCircle.draw(50, 80);
    blueCircle.draw(30, 40);
    redCircle.draw(15, 30);
    greenCircle.draw(50, 90);
    blueCircle.draw(35, 60);
  }
}
