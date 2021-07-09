/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum

*/
class MaxSubArray {
    public int maxSubArray(int[] nums) {
       int ans= Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                ans= Math.max(ans, sum(nums, i, j));
            }
        }
        
        return ans;
        
    }
    public int sum(int[] nums, int start, int end){
        int sum=0;
        for(int i=start; i<=end; i++){
            sum+= nums[i];
        }
        
        return sum;
    }
    
}
