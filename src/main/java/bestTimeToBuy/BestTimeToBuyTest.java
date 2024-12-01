package bestTimeToBuy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyTest {
    BestTimeToBuy bestTimeToBuy = new BestTimeToBuy();

    @Test
    public void bestTimeToBuyTest(){
        int[] nums = {7,1,5,3,6,4};
        int correctResult = 5;
        int result = bestTimeToBuy.maxProfit(nums);
        assertEquals(correctResult,result);
    }
}
