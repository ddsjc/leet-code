package jumpGame;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {
    JumpGame jumpGame = new JumpGame();

    @Test
    public void  jumpGameTestFirst(){
        int[] nums = {2,3,1,1,4};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void  jumpGameTestSecond(){
        int[] nums = {2, 0};
        assertTrue(jumpGame.canJump(nums));
    }


}
