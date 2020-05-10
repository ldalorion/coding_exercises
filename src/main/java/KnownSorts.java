public class KnownSorts {

    /**
     *The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
     * from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
     * https://www.geeksforgeeks.org/selection-sort/
     *
     * @param a array to sort
     * @param l beginning index section of interest
     * @param r ending index section of interest
     */
    void selection(int[] a, int l, int r) {
        CodeExerciseUtil.printArray("Current Array ", a, false);
        for (int i = l; i < r; i++) {
            int min = i;
            for (int j = i + 1; j <= r; j++) {
                if (SortUtils.less(a[j], a[min])) {
                    min = j;
                }
            }
            System.out.println("i  : " + i);
            System.out.println("min: " + min);
            CodeExerciseUtil.printArray("Array before swap: ", a, true);
            SortUtils.swap(a, i, min);
            CodeExerciseUtil.printArray("Array after swap : ", a, true);
        }
    }

    /**
     * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
     * https://www.geeksforgeeks.org/insertion-sort/
     *
     * @param a array to sort
     * @param l beginning index section of interest
     * @param r ending index section of interest
     */
    void insertion(int[] a, int l, int r) {
        CodeExerciseUtil.printArray("Current Array ", a, false);
        int i;
        // starting at the end of the array, move the smallest number all the way to
        // the beginning
        for (i = r; i > l; i--) {
            SortUtils.compareAndExchange(a, i - 1, i);
        }
        for (i = l + 2; i <= r; i++) {
            int j = i;
            int v = a[i];
            while (SortUtils.less(v, a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = v;
            CodeExerciseUtil.printArray("Current Array ", a, false);
        }
    }
}
