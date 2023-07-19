package creational.abstract_factory.factory;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.CheckBox;

public interface GUIFactory {
  Button createButton();
  CheckBox createCheckBox();
}
