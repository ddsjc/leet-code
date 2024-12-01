package romanToInteger13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToInegerTest {
    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void romanToIntegerTest(){
        String s = new String("III");
        int correctResult = 3;
        int result = romanToInteger.romanToInt(s);
        assertEquals(correctResult, result);
    }

    @Test
    public void romanToIntegerTestTwo(){
        String s = new String("LVIII");
        int correctResult = 58;
        int result = romanToInteger.romanToInt(s);
        assertEquals(correctResult, result);
    }
    @Test
    public void romanToIntegerTestThree(){
        String s = new String("MCMXCIV");
        int correctResult = 1994;
        int result = romanToInteger.romanToInt(s);
        assertEquals(correctResult, result);
    }
    @Test
    public void romanToIntegerTestFour(){
        String s = new String("MCMX");
        int correctResult = 2910;
        int result = romanToInteger.romanToInt(s);
        assertEquals(correctResult, result);
    }
}
