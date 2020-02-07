import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * SolutionTest
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void solutionResult_equals() {
        // given
        String[] args = new String[] { "1000", "70", "170" };
        int expected = 11;

        // when
        int result = solution.solution(args);

        // then
        assertSame(expected, result);
    }
}
