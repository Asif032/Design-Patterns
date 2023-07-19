package creational.abstract_factory;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.MacFactory;
import creational.abstract_factory.factory.WindowsFactory;
import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.CheckBox;

public class Main {
  public static void main(String[] args) {
    GUIFactory windowsFactory = new WindowsFactory();
    Button windowsButton = windowsFactory.createButton();
    CheckBox windowsCheckBox = windowsFactory.createCheckBox();
    windowsButton.render();
    windowsCheckBox.render();

    GUIFactory macFactory = new MacFactory();
    Button macButton = macFactory.createButton();
    CheckBox macCheckBox = windowsFactory.createCheckBox();
    macButton.render();
    macCheckBox.render();
  }
}
