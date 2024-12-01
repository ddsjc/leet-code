package searchInsertPosition;

import java.util.HashMap;
import java.util.Map;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int number = 0;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                number = i;
                break;
            }
            if(target < nums[i]){
                number = i;
                break;
            }
            else{
                number = i + 1;
            }
        }
        return number;
    }
}
