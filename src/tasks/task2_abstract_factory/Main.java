package tasks.task2_abstract_factory;

import tasks.task2_abstract_factory.factory.GUIFactory;
import tasks.task2_abstract_factory.factory.MacFactory;
import tasks.task2_abstract_factory.factory.WindowsFactory;
import tasks.task2_abstract_factory.products.Button;
import tasks.task2_abstract_factory.products.CheckBox;

public class Main {
  public static void main(String[] args) {
    GUIFactory windowsFactory = new WindowsFactory();
    Button windowsButton = windowsFactory.createButton();
    CheckBox windowsCheckBox = windowsFactory.createCheckBox();
    windowsButton.render();
    windowsCheckBox.render();

    GUIFactory macFactory = new MacFactory();
    Button macButton = macFactory.createButton();
    CheckBox macCheckBox = macFactory.createCheckBox();
    macButton.render();
    macCheckBox.render();
  }
}
