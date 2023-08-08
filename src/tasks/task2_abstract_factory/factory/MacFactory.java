package tasks.task2_abstract_factory.factory;

import tasks.task2_abstract_factory.products.Button;
import tasks.task2_abstract_factory.products.CheckBox;
import tasks.task2_abstract_factory.products.MacButton;
import tasks.task2_abstract_factory.products.MacCheckBox;

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