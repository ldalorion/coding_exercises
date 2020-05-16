package exercise;

import org.junit.Test;
import utils.CodeExerciseTestUtils;
import utils.CodeExerciseUtil;

public class LargestTripleProductTest {

    LargestTripleProduct target = new LargestTripleProduct();
    int[] input1 = {1, 2, 3, 4, 5};
    int[] output1 = {-1, -1, 6, 24, 60};

    int[] input2 = {2, 4, 7, 1, 5, 3};
    int[] output2 = {-1, -1, 56, 56, 140, 140};

    int[] input3 = {2, 1, 2, 1, 2};
    int[] output3 = {-1, -1, 4, 4, 8};

    @Test
    public void test_findMaxProduct_input1() {
        int[] actual = target.findMaxProduct(input1);
        CodeExerciseUtil.printArray("Actual output: ", actual, false);
        assert CodeExerciseTestUtils .theseShitsAreEqual(output1, actual);
    }

    @Test
    public void test_findMaxProduct_input2() {
        int[] actual = target.findMaxProduct(input2);
        CodeExerciseUtil.printArray("Actual output: ", actual, false);
        assert CodeExerciseTestUtils.theseShitsAreEqual(output2, actual);
    }

    @Test
    public void test_findMaxProduct_input3() {
        int[] actual = target.findMaxProduct(input3);
        CodeExerciseUtil.printArray("Actual output: ", actual, false);
        assert CodeExerciseTestUtils .theseShitsAreEqual(output3, actual);
    }
}