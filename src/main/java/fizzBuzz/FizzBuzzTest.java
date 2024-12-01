package fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzTest() throws IllegalAccessException{
        int target = 15;
        byte[] result = fizzBuzz.fizzBuzz(target);
        assertArrayEquals("FizzBuzz".getBytes(), result);
    }

    @Test
    public  void fizzBuzzTestTwo() throws IllegalAccessException{
        int target = 3;
        byte[] result = fizzBuzz.fizzBuzz(target);
        assertArrayEquals("Fizz".getBytes(), result);
    }

    @Test
    public  void fizzBuzzTestThree() throws  IllegalAccessException{
        int target = 5;
        byte[] result = fizzBuzz.fizzBuzz(target);
        assertArrayEquals("Buzz".getBytes(), result);
    }

    @Test
    public  void fizzBuzzTestFour() throws  IllegalAccessException{
        int target = 4;
        assertThrows(IllegalAccessException.class, ()->fizzBuzz.fizzBuzz(target));
    }

}
