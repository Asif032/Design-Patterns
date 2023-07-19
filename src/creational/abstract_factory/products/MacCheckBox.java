package creational.abstract_factory.products;

public class MacCheckBox implements CheckBox {
  @Override
  public void render() {
    System.out.println("Rendering a Mac checkbox");
  }
}
