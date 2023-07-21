package behavioural.Iterator;

public class Main {
  public static void main(String[] args) {
    String[] array = {"abc", "xyz", "k", "s", "t"};
    ArrayContainer<String> container = new ArrayContainer<String>(array);
    Iterator<String> iterator = container.createIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
