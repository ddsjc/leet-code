package plusOne;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void plusOneTestOne(){
        int[] digits = {1,2,3};
        int[] correctResult = {1,2,4};
        int[] result = plusOne.plusOne(digits);
        assertArrayEquals(correctResult, result);
    }
    @Test
    public void plusOneTestTwo(){
        int[] digits = {4,3,2,1};
        int[] correctResult = {4,3,2,2};
        int[] result = plusOne.plusOne(digits);
        assertArrayEquals(correctResult, result);
    }
}
