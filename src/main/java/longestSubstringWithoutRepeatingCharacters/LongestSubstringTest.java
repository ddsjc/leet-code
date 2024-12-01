package longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringTest {
    LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    public void  longestSubstringTest(){
        String s = "abcabcbb";
        int correctResult = 3;
        int result = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(correctResult, result);
    }
}
