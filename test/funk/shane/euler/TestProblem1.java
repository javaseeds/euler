package funk.shane.euler;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shane on 12/31/2014.
 */
public class TestProblem1 {
    private Problem1 problem1;

    @Before
    public void setup() {
        problem1 = new Problem1();
    }

    @Test
    public void testProblem1() {
        assertThat(problem1.sum(10), is(23));
    }
}
