package tasks.task2_abstract_factory.products;

public class WindowsCheckBox implements CheckBox {
  @Override
  public void render() {
    System.out.println("Rendering a Windows checkbox");
  }
}
