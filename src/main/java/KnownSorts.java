public class KnownSorts {

    /**
     * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
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
        CodeExerciseUtil.printArray("In the beginning ", a, true);
        int i;
        // starting at the end of the array, move the smallest number all the way to
        // the beginning
        for (i = r; i > l; i--) {
            SortUtils.compareAndExchange(a, i - 1, i);
        }
        for (i = l + 2; i <= r; i++) {
            CodeExerciseUtil.printArray("2nd for loop ", a, true);
            int j = i;
            int v = a[i];
            System.out.println("a[" + i + "]: " + v);
            System.out.println("a[" + (j - 1) + "]: " + a[(j - 1)]);
            System.out.println("SortUtils.less(" + v + ", " + a[(j - 1)] + ")");
            while (SortUtils.less(v, a[j - 1])) {
                System.out.println("-----WHILE-----");
                System.out.println("a[" + (j - 1) + "]: " + a[(j - 1)]);
                System.out.println("a[" + j + "]: " + a[j]);
                a[j] = a[j - 1];
                System.out.println("a[" + (j - 1) + "]: " + a[(j - 1)]);
                System.out.println("a[" + j + "]: " + a[j]);
                j--;
                System.out.println("SortUtils.less(" + v + ", " + a[(j - 1)] + ")");
                System.out.println("-----WHILE-----");
            }
            a[j] = v;
            System.out.println("a[j] = v");
            System.out.println("a[" + j + "]: " + v);
        }
    }

    /**
     * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
     * https://www.geeksforgeeks.org/bubble-sort/
     *
     * @param a array to sort
     * @param l beginning index section of interest
     * @param r ending index section of interest
     */
    void bubble(int[] a, int l, int r) {
        for (int i = l; i < r; i++) {
            for (int j = r; j > i; j--) {
                SortUtils.compareAndExchange(a, j - 1, j);
            }
        }
    }

    /**
     * Nonadaptive insertion sort.
     *
     * @param a array to sort
     * @param l beginning index section of interest
     * @param r ending index section of interest
     */
    void insertionSortExchangedBased(int[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            for (int j = i; j > l; j--) {
                SortUtils.compareAndExchange(a, j - 1, j);
            }
        }
    }

    /**
     * One way to implement shellsort would be, for each h, to use insertion sort independently on each of the h subfiles.
     *
     * @param a array to sort
     * @param l beginning index section of interest
     * @param r ending index section of interest
     */
    void shell(int[] a, int l, int r) {
        int h;
        for (h = 1; h <= (r - 1) / 9; h = 3 * h + 1) ;
        for (; h > 0; h /= 3) {
            for (int i = 1 + h; i <= r; i++) {
                int j = i;
                int v = a[i];
                while (j >= l + h && SortUtils.less(v, a[j - h])) {
                    a[j] = a[j - h];
                    j -= h;
                }
                a[j] = v;
            }
        }
    }
}
