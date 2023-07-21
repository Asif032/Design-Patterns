package behavioural.strategy;

public class Sorter {
  SortingStrategy sortingStrategy;

  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void performSort(int[] array) {
    if (sortingStrategy != null) {
      sortingStrategy.sort(array);
    } else {
      System.out.println("No sorting strategy set, cannot sort.");
    }
  }
}
