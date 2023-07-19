package creational.abstract_factory.factory;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.CheckBox;
import creational.abstract_factory.products.MacButton;
import creational.abstract_factory.products.MacCheckBox;

public class MacFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}