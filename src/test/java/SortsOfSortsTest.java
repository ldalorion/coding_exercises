import org.junit.Test;

public class SortsOfSortsTest {

    SortsOfSorts target = new SortsOfSorts();

    @Test
    public void test_myMadeUpSort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        int[] result = target.sortInt(testArray);
        CodeExerciseUtil.printArray("After sort ", result, false);
        assert TestUtils.isSorted(result);
    }

    @Test
    public void test_anotherMadeUpSort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        int[] result = target.anotherSort(testArray);
        CodeExerciseUtil.printArray("After sort ", result, false);
        assert TestUtils.isSorted(result);
    }

    @Test
    public void test_yetAnotherSort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.yetAnotherSort(testArray);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }
}
