package behavioural.Iterator;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
  private final T[] array;
  private int position;

  public ArrayIterator(T[] array) {
    this.array = array;
    this.position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < array.length;
  }

  @Override
  public T next() {
    if (hasNext()) {
      return array[position++];
    }
    throw new NoSuchElementException("No more element in the array");
  }
}
