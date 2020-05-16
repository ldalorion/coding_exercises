package utils;

import java.util.HashSet;
import java.util.Set;

public class CodeExerciseTestUtils {

    public static int[] generateRandomNumbers(int desiredArrayLength) {
        int[] nums = new int[desiredArrayLength];
        Set<Integer> distinctNums = new HashSet<>(desiredArrayLength);
        int i = 0;
        do {
            // The code to generate a random integer value between a specified range is this.
            // https://dzone.com/articles/random-number-generation-in-java
            int randomNumber = (int) (Math.random() * ((20 - 1) + 1)) + 1;
            if (distinctNums.add(randomNumber)) {
                nums[i] = randomNumber;
            }
            i++;
        } while (i < desiredArrayLength);

        return nums;
    }

    public static boolean theseShitsAreEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                 if (a[i] != b[i]) {
                     return false;
                 }
            }
        }
        return true;
    }

    public static boolean isSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
