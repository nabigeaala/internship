/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*/
class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    ans++;
            }
        }
        
        return ans;
    }
}
