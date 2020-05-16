package utils;

public class SortUtils {

    public static void swap(int[] numbers, int indx1, int indx2) {
        int temp = numbers[indx1];
        numbers[indx1] = numbers[indx2];
        numbers[indx2] = temp;
    }

    public static void compareAndExchange(int[] numbers, int i, int j) {
        if (less(numbers[j], numbers[i])) {
            swap(numbers, i, j);
        }
    }

    public static boolean less(int i, int j) {
        return i < j;
    }
}
