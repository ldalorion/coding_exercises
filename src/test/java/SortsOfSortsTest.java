import org.junit.Test;

public class SortsOfSortsTest {

    @Test
    public void test_myMadeUpSort() {
        SortsOfSorts target = new SortsOfSorts();
        int[] testArray = TestUtils.generateRandomNumbers(10);
        TestUtils.printArray("Before sort ", testArray, false);
        int[] result = target.sortInt(testArray);
        TestUtils.printArray("After sort ", result, false);
        assert isSorted(result);
    }

    boolean isSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
