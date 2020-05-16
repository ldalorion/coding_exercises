package exercise;

import org.junit.Test;
import utils.CodeExerciseUtil;

public class PairSumsTest {

    PairSums target = new PairSums();
    int[] input = new int[]{1, 2, 3, 4, 3};
    int inputSum = 6;
    int inputExpectedPairs = 2;
    int[] input2 = new int[]{1, 5, 3, 3, 3};
    int input2ExpectedPairs = 4;

    @Test
    public void test_numberOfWays_input() {
        CodeExerciseUtil.printArray("Test Input", input, true);
        int pairs = target.numberOfWays(input, inputSum);
        assert pairs == inputExpectedPairs;
    }

    @Test
    public void test_numberOfWays_input2() {
        CodeExerciseUtil.printArray("Test Input", input, true);
        int pairs = target.numberOfWays(input2, inputSum);
        System.out.println("Actual Pairs: " + pairs);
        assert pairs == input2ExpectedPairs;
    }
}