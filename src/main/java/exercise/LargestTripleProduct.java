package exercise;

import static utils.CodeExerciseUtil.*;

/**
 * You're given a list of n integers arr[0..(n-1)]. You must compute a list output[0..(n-1)] such that, for each
 * index i (between 0 and n-1, inclusive), output[i] is equal to the product of the three largest elements
 * out of arr[0..i] (or equal to -1 if i < 2, as arr[0..i] then includes fewer than three elements).
 * <p>
 * Note that the three largest elements used to form any product may have the same values as one another, but
 * they must be at different indices in arr.
 */
public class LargestTripleProduct {

    int[] findMaxProduct(int[] arr) {

        int[] maxProductArray = new int[arr.length];
        for (int i = 0; i < arr.length - 2; i++) {
            int tripleProduct = arr[i] * arr[i + 1] * arr[i + 2];
            if (maxProductArray[i] == 0 ) {
                maxProductArray[i] = -1;
            }
            maxProductArray[i + 2] = tripleProduct;
            println("Triple Product: " + tripleProduct);
            printArray("Current Max Product Array: ", maxProductArray, false);
        }
        return maxProductArray;
    }
}
