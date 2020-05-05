import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TwoSumTest {

    TwoSum target = new TwoSum();

    @Test
    public void test_bruteForce() {
        int[] nums = TestUtils.generateRandomNumbers(20);
        int testSum = 10;
        TestUtils.printArray("numbers generated", nums, true);
        int[] result = target.bruteForce(nums, testSum);
        assert result != null;
        assert (nums[result[0]] + nums[result[0]]) == testSum;
        TestUtils.printArray("Result", result, false);
    }

    @Test
    public void test_myGarbageSolution() {
        int[] nums = TestUtils.generateRandomNumbers(20);
        int testSum = 10;
        TestUtils.printArray("numbers generated", nums, true);
        int[] result = target.myGarbageSolution(nums, testSum);
        assert result != null;
        assert (nums[result[0]] + nums[result[0]]) == testSum;
        TestUtils.printArray("Result", result, false);
    }
}
