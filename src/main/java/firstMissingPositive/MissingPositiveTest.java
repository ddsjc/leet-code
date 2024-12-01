package firstMissingPositive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingPositiveTest {

    MissingPositive missingPositive = new MissingPositive();
    @Test
    public void missingPositiveTest(){
        int[] nums = {1,2,0};
        int correctAnswer = 3;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }

    @Test
    public void missingPositiveTestTwo(){
        int[] nums = {3,4,-1,1};
        int correctAnswer = 2;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTestThree(){
        int[] nums = {7,8,9,11,12};
        int correctAnswer = 1;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTestFour(){
        int[] nums = {-5};
        int correctAnswer = 1;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTestFive(){
        int[] nums = {2,1};
        int correctAnswer = 3;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTestSix(){
        int[] nums = {2};
        int correctAnswer = 1;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTestSeven(){
        int[] nums = {0,2,2,1,1};
        int correctAnswer = 3;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }
    @Test
    public void missingPositiveTest8(){
        int[] nums = {1,0,3,3,0,2};
        int correctAnswer = 4;
        int result = missingPositive.secondMissingPositive(nums);
        assertEquals(correctAnswer, result);
    }


}
