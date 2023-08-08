package tasks.task2_abstract_factory.factory;

import tasks.task2_abstract_factory.products.Button;
import tasks.task2_abstract_factory.products.CheckBox;
import tasks.task2_abstract_factory.products.WindowsButton;
import tasks.task2_abstract_factory.products.WindowsCheckBox;

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
