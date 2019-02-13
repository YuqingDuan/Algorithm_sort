/**
 * Basic idea of insert sort:
 * The sequence of n elements is divided into two parts:
 * the ordered part and the disordered part, as shown in the example of insert sort process.
 * Each processing is to compare the first element of an unordered sequence with that of an ordered sequence one by one.
 * Find the insertion position and insert the element into the appropriate position of the ordinal sequence.
 */
public class InsertSort {
    public static void sort(int[] intArray, int stat, int inc) {
        for (int i = stat + inc; i < intArray.length; i += inc) {
            for (int j = i; (j >= inc) && (intArray[j] < intArray[j - inc]); j -= inc) {
                if (intArray[j] < intArray[j - 1]) {
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
