package addBinary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void addBinaryTestOne(){
        String result = addBinary.addBinary("11", "1");
        assertEquals("100", result);
    }
    @Test
    public void addBinaryTestTwo(){
        String result = addBinary.addBinary("1010", "1011");
        assertEquals("10101", result);
    }
}
