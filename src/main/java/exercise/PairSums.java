package exercise;

import static utils.CodeExerciseUtil.*;

/**
 * Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements within it which sum to k.
 * If an integer appears in the list multiple times, each copy is considered to be different;
 * that is, two pairs are considered different if one pair includes at least one array index which the other doesn't,
 * even if they include the same values.
 */

public class PairSums {

    int numberOfWays(int[] arr, int k) {
        // Write your code here
        int pairs = 0;
        int[][] pairings = new int[arr.length/2][arr.length/2];
        for (int i = 0; i < arr.length; i++) {
            int complement = k - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == complement) {
                    println("Complement: " + complement);
                    println("arr[" + i + "]: " + arr[i]);
                    println("arr[" + j + "]: " + arr[j]);
                    printArray("Current state of arr", arr, true);
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
