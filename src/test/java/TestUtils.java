import java.util.HashSet;
import java.util.Set;

public class TestUtils {

    static int[] generateRandomNumbers(int desiredArrayLength) {
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
        } while (i < desiredArrayLength) ;

        return nums;
    }

    static void printArray(String description, int[] result, boolean printIndx) {
        System.out.print(description + ": ");
        for (int i = 0; i < result.length; i++) {
            if (printIndx) {
                System.out.print("["+i+"]: "+result[i] + ", ");
            } else {
                System.out.print(result[i] + ", ");
            }
        }
        System.out.println();
    }
}
