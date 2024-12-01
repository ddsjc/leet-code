package lemonadeChange;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LemonadeChangeTest {
    LemonadeChange lemonadeChange = new LemonadeChange();

    @Test
    public void lemonadeChangeTest(){
        int[] bills = {5,5,5,10,20};
        boolean result = lemonadeChange.lemonadeChange(bills);
        assertTrue(result);
    }

    @Test
    public void lemonadeChangeTestTwo(){
        int[] bills = {5,5,10,10,20};
        boolean result = lemonadeChange.lemonadeChange(bills);
        assertFalse(result);
    }
}
