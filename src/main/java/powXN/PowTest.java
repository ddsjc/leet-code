package powXN;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowTest {
    Pow pow = new Pow();

    @Test
    public void powTestOne(){
        double result = pow.myPow(2,2);
        assertEquals(4, result, 0);
    }

    @Test
    public void powTestTwo(){
        double result = pow.myPow(2,10);
        assertEquals(1024, result, 0);
    }
}
