package exercise;

import org.junit.Test;

public class DetermineBalanceTest {
    DetermineBalance target = new DetermineBalance();
    @Test
    public void test_isBalanced() {
        assert target.isBalanced("((()))");
    }
}
