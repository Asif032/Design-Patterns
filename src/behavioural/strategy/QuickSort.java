package behavioural.strategy;

public class QuickSort implements SortingStrategy {
  @Override
  public void sort(int[] array) {
    System.out.println("Sorting array using quick sort.");
  }
}
