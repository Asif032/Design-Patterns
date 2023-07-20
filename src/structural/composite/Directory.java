package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
  private String directoryName;
  private List<FileSystemComponent> children;

  public Directory(String directoryName) {
    this.directoryName = directoryName;
    children = new ArrayList<>();
  }

  public void addComponent(FileSystemComponent component) {
    children.add(component);
  }

  public void removeComponent(FileSystemComponent component) {
    children.remove(component);
  }

  @Override
  public void showDetails() {
    System.out.println("Directory: " + directoryName);
    for (FileSystemComponent component : children) {
      component.showDetails();
    }
  }
}
