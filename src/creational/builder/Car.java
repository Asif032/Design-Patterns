package creational.builder;

public class Car {
  private String brand;
  private String model;
  private String year;
  private String color;
  private int horsePower;

  public Car(String brand, String model, String year, String color, int horsePower) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.color = color;
    this.horsePower = horsePower;
  }

  @Override
  public String toString() {
    return "Car{" +
            "brand = '" + brand + '\'' +
            ", model = '" + model + '\'' +
            ", year = " + year +
            ", color = '" + color + '\'' +
            ", horsePower = " + horsePower +
            '}';
  }
}
