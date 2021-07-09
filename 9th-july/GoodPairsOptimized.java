/*Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*/

import java.util.*;

class GoodPairsOptimized {
    public int numIdenticalPairs(int[] nums) {
        int totalPair = 0;
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i])) {
                int value = maps.get(nums[i]);
                totalPair += value;
                maps.put(nums[i], value+1);
            } else {
                maps.put(nums[i], 1);
            }
        }
        return totalPair;
    }
}
