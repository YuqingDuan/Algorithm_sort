import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 3, 1, 4};
        System.out.println("initial array:" + Arrays.toString(intArray));
        // BubbleSort.sort(intArray);
        // SelectionSort.sort(intArray);
        // InsertSort.sort(intArray);
        // QuickSort.quickSort(intArray, 0, intArray.length - 1);
        // MergeSort.sort(intArray, 0, intArray.length - 1, new int[intArray.length]);
        ShellSort.sort(intArray);
        System.out.println("sorted array: " + Arrays.toString(intArray));
    }
}
