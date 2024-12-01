package lengthOfLastWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
    @Test
    public void lengthOfLastWordTestFirst(){
        String s = "Hello world";
        int correctResult = 5;
        int result = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(correctResult, result);
    }
    @Test
    public void lengthOfLastWordTestTwo(){
        String s = "   fly me   to   the moon  ";
        int correctResult = 4;
        int result = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(correctResult, result);
    }
    @Test
    public void lengthOfLastWordTestThree(){
        String s = "luffy is still joyboy";
        int correctResult = 6;
        int result = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(correctResult, result);
    }
}
