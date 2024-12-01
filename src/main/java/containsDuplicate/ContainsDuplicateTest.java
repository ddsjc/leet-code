package containsDuplicate;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public  void  containsDuplicateTestOne() {
        int[] array = {1,2,3,1};
        boolean result = containsDuplicate.containsDuplicate(array);
        assertTrue(result);
    }

    @Test
    public  void  containsDuplicateTestTwo() {
        int[] array = {1,2,3,4};
        boolean result = containsDuplicate.containsDuplicate(array);
        assertFalse(result);
    }

    @Test
    public  void  containsDuplicateTestThree() {
        int[] array = {1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicate.containsDuplicate(array);
        assertTrue(result);
    }
}
