package sorting;

import org.junit.Test;
import sorting.SortsOfSorts;
import utils.CodeExerciseTestUtils;
import utils.CodeExerciseUtil;

public class SortsOfSortsTest {

    SortsOfSorts target = new SortsOfSorts();

    @Test
    public void test_myMadeUpSort() {
        int[] testArray = CodeExerciseTestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        int[] result = target.sortInt(testArray);
        CodeExerciseUtil.printArray("After sort ", result, false);
        assert CodeExerciseTestUtils.isSorted(result);
    }

    @Test
    public void test_anotherMadeUpSort() {
        int[] testArray = CodeExerciseTestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        int[] result = target.anotherSort(testArray);
        CodeExerciseUtil.printArray("After sort ", result, false);
        assert CodeExerciseTestUtils.isSorted(result);
    }

    @Test
    public void test_yetAnotherSort() {
        int[] testArray = CodeExerciseTestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.yetAnotherSort(testArray);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert CodeExerciseTestUtils.isSorted(testArray);
    }
}
