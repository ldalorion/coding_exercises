import org.junit.Test;

public class KnownSortsTest {

    KnownSorts target = new KnownSorts();

    @Test
    public void test_selection_sort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.selection(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }

    @Test
    public void test_insertion_sort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.insertion(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }
}