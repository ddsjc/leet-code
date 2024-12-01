package twoSum;
import java.util.*;

public class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for(int i = 0; i < nums.length ; i++){
                for (int j = i+1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return result;
        }

        public int[] secondTwoSum(int[] nums, int target){
            Map<Integer,Integer> indexes = new HashMap<>();
            for (int i = 0; i<nums.length; i++){
                int different = target - nums[i];
                if(indexes.containsKey(different)){
                    return new int[]{indexes.get(different),i};
                }
                indexes.put(nums[i], i);
            }
            throw new IllegalArgumentException("No SOLUTIONS Blyat");
        }
}
