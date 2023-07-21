package behavioural.strategy;

public class Main {
  public static void main(String[] args) {
    int array[] = {5, 2, 3, 1, 7, 6};

    SortingStrategy bubbleSort = new BubbleSort();
    SortingStrategy mergeSort = new MergeSort();
    SortingStrategy quickSort = new QuickSort();

    Sorter sorter = new Sorter();
    sorter.setSortingStrategy(bubbleSort);
    sorter.performSort(array);
    sorter.setSortingStrategy(mergeSort);
    sorter.performSort(array);
    sorter.setSortingStrategy(quickSort);
    sorter.performSort(array);
  }
}
