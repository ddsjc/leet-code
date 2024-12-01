package reverseInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public  void reverseIntegerTest(){
        int result = reverseInteger.reverse(321);
        assertEquals(123 , result);
    }

    @Test
    public  void reverseIntegerTestTwo(){
        int result = reverseInteger.reverse(-321);
        assertEquals(-123 , result);
    }
}
