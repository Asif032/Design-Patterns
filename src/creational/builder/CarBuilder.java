package creational.builder;

public class CarBuilder {
  private String brand;
  private String model;
  private String year;
  private String color;
  private int horsePower;

  public CarBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  public CarBuilder setYear(String year) {
    this.year = year;
    return this;
  }

  public CarBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  public CarBuilder setHorsePower(int horsePower) {
    this.horsePower = horsePower;
    return this;
  }

  public Car build() {
    return new Car(brand, model, year, color, horsePower);
  }
}
