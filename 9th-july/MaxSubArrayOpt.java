/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

*/
class MaxSubArrayOpt {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int max_curr= nums[0];
        int max_so_far= nums[0];
        for(int i=1; i<nums.length; i++){
            max_curr= Math.max(nums[i], max_curr + nums[i]);
            max_so_far= Math.max(max_so_far, max_curr);
            
        }
        
        return max_so_far;
    }
}
