package threeSum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> foundTriplets = new TreeSet<>();
        Set<List<Integer>> triplets = new HashSet<>();
        int different;
        for (int num: nums){
            foundTriplets.add(num);
        }
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                different = -(nums[i] + nums[j]);
                if(foundTriplets.contains(different) && different!= nums[i] && different!= nums[j]){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(different);
                    foundTriplets.remove(different);
                    triplets.add(triplet);
                }
            }
        }

        return new ArrayList<>(triplets);
    }

    public List<List<Integer>> threeSumTwo(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2 && nums[i] <= 0; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = n - 1;
            while (j < k) {
                int x = nums[i] + nums[j] + nums[k];
                if (x < 0) {
                    ++j;
                } else if (x > 0) {
                    --k;
                } else {
                    triplets.add(List.of(nums[i], nums[j++], nums[k--]));
                    while (j < k && nums[j] == nums[j - 1]) {
                        ++j;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        --k;
                    }
                }
            }
        }
        return triplets;
    }
}
