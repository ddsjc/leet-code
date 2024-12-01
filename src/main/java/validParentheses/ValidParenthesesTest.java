package validParentheses;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();
    @Test
    public void  jumpGameTestFirst(){
        String s = new String();
        s = "()";
        assertTrue(validParentheses.isValid(s));
    }
    @Test
    public void  jumpGameTestSecond(){
        String s = new String();
        s = "()[]{}";
        assertTrue(validParentheses.isValid(s));
    }
    @Test
    public void  jumpGameTestThird(){
        String s = new String();
        s = "(]";
        assertFalse(validParentheses.isValid(s));
    }
    @Test
    public void  jumpGameTestFour(){
        String s = new String();
        s = "([)]";
        assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void  jumpGameTestFive(){
        String s = new String();
        s = "{[]}";
        assertTrue(validParentheses.isValid(s));
    }

}
