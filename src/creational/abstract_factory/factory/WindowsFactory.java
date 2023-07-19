package creational.abstract_factory.factory;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.CheckBox;
import creational.abstract_factory.products.WindowsButton;
import creational.abstract_factory.products.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WindowsCheckBox();
  }
}
