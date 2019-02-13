/**
 * The basic concepts of selection sort are:
 * Compare the first element with all the following elements in turn.
 * After the first time, there will be a minimum at the front.
 * Analogy in turn.
 */
public class SelectionSort {
    public static void sort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
