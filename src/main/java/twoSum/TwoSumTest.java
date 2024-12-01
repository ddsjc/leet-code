package twoSum;

import org.junit.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class TwoSumTest {
    private Solution solution = new Solution();
    @Test
    public void firstTest() {
        int[] inputMas = {2,7,11,15};
        int target = 9;
        int[] expectedOutput = {0, 1};
        int[] result = solution.secondTwoSum(inputMas, target);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void secondTest(){
        int[] inputMas = {3,2,4};
        int target = 6;
        int[] expectedOutput = {1, 2};
        int[] result = solution.secondTwoSum(inputMas, target);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void thirdTest(){
        int[] inputMas = {3,3};
        int target = 6;
        int[] expectedOutput = {0, 1};
        int[] result = solution.secondTwoSum(inputMas, target);
        assertArrayEquals(expectedOutput, result);
    }
}
