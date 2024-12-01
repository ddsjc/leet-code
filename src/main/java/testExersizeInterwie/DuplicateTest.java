package testExersizeInterwie;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static testExersizeInterwie.Duplicate.task;

public class DuplicateTest {

    @Test
    public void duplicateTestFirst() {
        double[] a = {2, 1, 4, 2, 3};
        double[] correctResult = {1, 4, 2, 3};
        double[] result = task(a);
        assertArrayEquals(correctResult, result, 0.0);
    }

    @Test
    public void duplicateTestSecond() {
        double[] a = {2, 1, 4, 2, 3, 1, 1, 1, 5};
        double[] correctResult = { 4, 2, 3, 1, 5};
        double[] result = task(a);
        assertArrayEquals(correctResult, result, 0.0);
    }

    @Test
    public void duplicateTestThird() {
        double[] a = {2, 2, 4, 2, 3, 1, 10, 1, 5};
        double[] correctResult = { 4, 2, 3, 10, 1, 5};
        double[] result = task(a);
        assertArrayEquals(correctResult, result, 0.0);
    }

    @Test(expected = RuntimeException.class)
    public void negativeTestFirst() {
        double[] a = {2, -2, 4, 2, 3, 1, 10, 1, 5};
        task(a);
    }
}
