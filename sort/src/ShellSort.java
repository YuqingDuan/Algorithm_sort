/**
 * Shell sort is essentially a grouping insert sort method.
 * Its basic idea is: for n elements array to be sorted, take an integer gap less than n (gap is called step length)
 * and divide the elements to be sorted into several sub-groups.
 * All records whose distances are multiple of gap are placed in the same group.
 * Then, the elements in each group are using insert sort directly.
 * After this sorting, the elements of each group are ordered. T
 * hen reduce the value of gap and repeat the above grouping and sorting.
 * Repeat this operation. When gap = 1, the whole sequence is ordered.
 */
public class ShellSort {
    public static void sort(int[] data) {
        for (int i = data.length / 2; i > 2; i /= 2) {
            for (int j = 0; j < i; j++) {
                InsertSort.sort(data, j, i);
            }
        }
        InsertSort.sort(data, 0, 1);
    }
}
