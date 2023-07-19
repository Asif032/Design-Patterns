package creational.builder;

public class Main {
  public static void main(String[] args) {
    Car car = new CarBuilder()
            .setBrand("Toyota")
            .setModel("Supra")
            .setYear("2023")
            .setColor("Silver")
            .setHorsePower(255)
            .build();

    System.out.println(car);
  }
}
