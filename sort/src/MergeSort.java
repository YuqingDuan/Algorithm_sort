/**
 * Merge Sort is to use merge idea to sort arrays.
 * According to the specific implementation, merge sorting includes two ways: top-down and bottom-up.
 * 1. Merge sort from bottom to top:
 * --divide the sequence to be sorted into several subsequences of length 1, then merge them in pairs;
 * --get several ordered sequences of length 2, then merge them in pairs;
 * --get several ordered sequences of length 4, then merge them in pairs;
 * merge them directly into one number to end. This gives us the sort result we want.
 * 2. Top-down merge sort:
 * (1) Decomposition - dividing the current interval into two parts, i.e. finding the splitting point mid = (low + high) / 2;
 * (2) Solution - recursively merge and rank the two sub-intervals a [low... mid] and a [mid + 1... high]. The recursive termination condition is that the subinterval length is 1.
 * (3) Merge - merge the sorted two sub-intervals a [low... mid] and a [mid + 1... high] into an ordered interval a [low... high].
 */
public class MergeSort {
    /**
     * Combines two adjacent ordered sub-arrays into one.
     *
     * @param arr  merged array
     * @param low  start index of the first ordered array.
     * @param mid  end index of the first ordered array; start index of the second ordered array
     * @param high end index of the second ordered array
     */
    public static void merge(int[] arr, int low, int mid, int high, int[] tmp) {
        int i = 0;
        // start index of the left first ordered array
        int j = low;
        // start index of the right first ordered array
        int k = mid + 1;

        // sort
        while (j <= mid && k <= high) {
            if (arr[j] < arr[k]) {
                tmp[i++] = arr[j++];
            } else {
                tmp[i++] = arr[k++];
            }
        }
        // if the left sequence still has some elements, copy them all into tmp[]
        while (j <= mid) {
            tmp[i++] = arr[j++];
        }

        while (k <= high) {
            tmp[i++] = arr[k++];
        }

        for (int t = 0; t < i; t++) {
            arr[low + t] = tmp[t];
        }

    }

    public static void sort(int[] arr, int low, int high, int[] tmp) {
        if (low < high) {
            // decomposition
            int mid = (low + high) / 2;
            // merge and sort left sequences
            sort(arr, low, mid, tmp);
            // merge and sort right sequences
            sort(arr, mid + 1, high, tmp);
            // merge two ordered sub-arrays
            merge(arr, low, mid, high, tmp);
        }
    }
}
