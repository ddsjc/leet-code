package threeSum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    public void threeSumTestFirst(){
        int[] nums = {-1,0,1,2,-1,-4};
        List<Integer> correctNums1= new ArrayList<>(){{
            add(-1);add(-1); add(2);
        }};

        List<Integer> correctNums2= new ArrayList<>(){{
            add(-1);add(0); add(1);
        }};
        List<List<Integer>> correctResult = new ArrayList<>();
        correctResult.add(correctNums1);
        correctResult.add(correctNums2);
        List<List<Integer>> result = new ArrayList<>();
        result = threeSum.threeSumTwo(nums);
        assertEquals(correctResult, result);
    }
}
