package exercise;

import org.junit.Test;
import utils.CodeExerciseTestUtils;
import utils.CodeExerciseUtil;

public class TwoSumTest {

    TwoSum target = new TwoSum();

    @Test
    public void test_bruteForce() {
        int[] nums = CodeExerciseTestUtils.generateRandomNumbers(20);
        int testSum = 10;
        CodeExerciseUtil.printArray("numbers generated", nums, true);
        int[] result = target.bruteForce(nums, testSum);
        assert result != null;
        assert (nums[result[0]] + nums[result[0]]) == testSum;
        CodeExerciseUtil.printArray("Result", result, false);
    }

    @Test
    public void test_myGarbageSolution() {
        int[] nums = CodeExerciseTestUtils .generateRandomNumbers(20);
        int testSum = 10;
        CodeExerciseUtil.printArray("numbers generated", nums, true);
        int[] result = target.myGarbageSolution(nums, testSum);
        assert result != null;
        assert (nums[result[0]] + nums[result[0]]) == testSum;
        CodeExerciseUtil.printArray("Result", result, false);
    }
}
