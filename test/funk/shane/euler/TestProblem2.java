package funk.shane.euler;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Shane on 12/31/2014.
 */
public class TestProblem2 {
    private Problem2 problem2;

    @Test
    public void testProblem2() {
        problem2 = new Problem2(10);
        assertThat(problem2.getSum()).isEqualTo(10);
    }
}
