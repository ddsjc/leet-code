package findTheIndexOfTheFirst;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexOfTheFirstTest {
    IndexOfTheFirst indexOfTheFirst = new IndexOfTheFirst();

    @Test
    public void indexOfTheFirstTest(){
        String haystack = "sadbutsad";
        String needle = "sad";
        int correctAnswer = 0;
        int result = indexOfTheFirst.strStr(haystack, needle);
        assertEquals(correctAnswer, result);
    }
}
