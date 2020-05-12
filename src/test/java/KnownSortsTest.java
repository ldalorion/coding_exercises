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
//        int[] testArray = TestUtils.generateRandomNumbers(10);
        int[] testArray = {17, 4, 19, 5, 1, 9, 8, 2, 15, 13};
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.insertion(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }

    @Test
    public void test_bubble_sort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.bubble(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }

    @Test
    public void test_exchanged_based_insertion_sort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.insertionSortExchangedBased(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }

    @Test
    public void test_shell_sort() {
        int[] testArray = TestUtils.generateRandomNumbers(10);
        CodeExerciseUtil.printArray("Before sort ", testArray, false);
        target.shell(testArray, 0, testArray.length - 1);
        CodeExerciseUtil.printArray("After sort ", testArray, false);
        assert TestUtils.isSorted(testArray);
    }
}