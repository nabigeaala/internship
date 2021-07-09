/*
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d)
return maximum product
*/
class MaximumProduct {
    public int maxProductDifference(int[] nums) {
        
        int len= nums.length;
        Arrays.sort(nums);
        
        return (nums[len-1]*nums[len-2])- (nums[0]*nums[1]);
        
    }
}
