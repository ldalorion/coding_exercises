package sorting;

import static utils.CodeExerciseUtil.*;
import static utils.SortUtils.*;

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
        printArray("Current Array ", a, false);
        for (int i = l; i < r; i++) {
            int min = i;
            for (int j = i + 1; j <= r; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            println("i  : " + i);
            println("min: " + min);
            printArray("Array before swap: ", a, true);
            swap(a, i, min);
            printArray("Array after swap : ", a, true);
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
                compareAndExchange(a, j - 1, j);
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
                compareAndExchange(a, j - 1, j);
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
        int h = 1;
        // instead of a sentinel, we're determining the h value
        for (; h <= (r - l) / 9; h = 3 * h + 1) ;
        // there is not initializer for h because it's at the top
        for (; h > 0; h /= 3) {
            // similar to insertion sort
            for (int i = l + h; i <= r; i++) {
                int j = i;
                int v = a[i];
                while (j >= l + h && less(v, a[j - h])) {
                    a[j] = a[j - h];
                    j -= h;
                }
                a[j] = v;
            }
        }
        // print statement on h at the end is 0 because it's an int. It typically would be a decimal point.
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
        printArray("In the beginning ", a, true);
        int i;
        // starting at the end of the array, move the smallest number all the way to
        // the beginning
        for (i = r; i > l; i--) {
            compareAndExchange(a, i - 1, i);
        }
        for (i = l + 2; i <= r; i++) {
            printArray("2nd for loop ", a, true);
            int j = i;
            int v = a[i];
            while (less(v, a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = v;
        }
    }
}
