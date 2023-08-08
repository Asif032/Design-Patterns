package tasks.task2_abstract_factory.factory;

import tasks.task2_abstract_factory.products.Button;
import tasks.task2_abstract_factory.products.CheckBox;

public interface GUIFactory {
  Button createButton();
  CheckBox createCheckBox();
}
