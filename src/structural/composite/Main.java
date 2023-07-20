package structural.composite;

public class Main {
  public static void main(String[] args) {
    FileSystemComponent f1 = new File("file1.txt");
    FileSystemComponent f2 = new File("file2.txt");

    Directory subDirectory = new Directory("subdirectory");
    subDirectory.addComponent(f1);
    subDirectory.addComponent(f2);

    Directory root = new Directory("root");
    root.addComponent(subDirectory);
    root.showDetails();
  }
}
