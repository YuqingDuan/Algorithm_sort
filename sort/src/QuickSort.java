/**
 * Quick sort:
 * A loop of quick sort algorithm is:
 * 1) Set two variables i and j to start the sorting: i = 0, j = N-1;
 * 2) Take the first array element as the key data and assign it to key, that is key = A [0].
 * 3) Search forward from j, that is, search forward from back (j=j-1 or j--).Find the first A [j] which is less than key. Set the value of A [i] to A [j].
 * 4) Search backwards from i, that is, from front to back (i=i+1, i++). Find the first A [i] which is larger than the key. Set the value of A [j] to A [i].
 * 5) Repeat steps 3, 4 and 5 until i = j;
 */
public class QuickSort {

    /**
     * Quick sort.
     *
     * @param intArray   array to be sorted
     * @param leftIndex  the left boundary of an array
     * @param rightIndex the right boundary of an array
     */
    public static void quickSort(int[] intArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int i, j, key;
            i = leftIndex;
            j = intArray.length - 1;
            key = intArray[i];

            while (i < j) {
                while (i < j && intArray[j] > key) {
                    j--;
                }
                if (i < j) {
                    intArray[i++] = intArray[j];
                }
                while (i < j && intArray[i] < key) {
                    i++;
                }
                if (i < j) {
                    intArray[j--] = intArray[i];
                }
            }
            // i=j
            intArray[i] = key;
            quickSort(intArray, leftIndex, i - 1);
            quickSort(intArray, i + 1, rightIndex);
        }
    }
}
