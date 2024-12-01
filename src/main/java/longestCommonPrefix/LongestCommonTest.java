package longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonTest {
    LongestCommon longestCommon = new LongestCommon();

    @Test
    public void longestCommonTest(){
        String[] strs = {"flower","flow","flight"};
        String correctResult = "fl";
        String result = longestCommon.longestCommonPrefix(strs);
        assertEquals(correctResult, result);
    }
    @Test
    public void longestCommonTestTwo(){
        String[] strs = {"dog","racecar","car"};
        String correctResult = "";
        String result = longestCommon.longestCommonPrefix(strs);
        assertEquals(correctResult, result);
    }
    @Test
    public void longestCommonTestThree(){
        String[] strs = {"a"};
        String correctResult = "a";
        String result = longestCommon.longestCommonPrefix(strs);
        assertEquals(correctResult, result);
    }
    @Test
    public void longestCommonTestFour(){
        String[] strs = {"flower","flower","flower","flower"};
        String correctResult = "flower";
        String result = longestCommon.longestCommonPrefix(strs);
        assertEquals(correctResult, result);
    }
}
