package creational.abstract_factory.products;

public class MacButton implements Button {
  @Override
  public void render() {
    System.out.println("Rendering a Mac button");
  }
}
