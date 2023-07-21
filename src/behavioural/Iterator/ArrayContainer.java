package behavioural.Iterator;

public class ArrayContainer<T> implements Container<T> {

  private final T[] array;

  public ArrayContainer(T[] array) {
    this.array = array;
  }

  @Override
  public Iterator<T> createIterator() {
    return new ArrayIterator<>(array);
  }
}
