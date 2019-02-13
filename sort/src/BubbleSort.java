/**
 * The basic concepts of bubble sort are:
 * Compare the two adjacent numbers in turn. Put small number in front and large numbers in back.
 * That is, in the first trip: first, compare the first and second numbers, put small before, large after.
 * Then compare the second number with the third number. Put the small number before the large number and the large number after the small number.
 * Then continue. Until the last two numbers are compared, the small number is put before the large number and the large number is put after the small number.
 * So far the first trip is over.
 * Put the maximum number at the end. In the second trip: still compare from the first pair of numbers.
 * (Because the first number may no longer less than the second number, possibly due to the exchange of the second number and the third number).
 * Put small numbers after large numbers, then compared to the penultimate number (the penultimate position is the largest in this iteration).
 * At the end of the second trip, you get a new maximum in the penultimate position.
 * (Actually, it's the second largest number in the whole sequence).
 * In this way, repeat the above process until the sorting is finally completed.
 */
public class BubbleSort {
    public static void sort(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
}
