<!--Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1  -->
  
  
  
  class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int n=nums.length;
        int maxEnd=nums[0];
        for(int i=1;i<n;i++)
        {
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            res=Math.max(res,maxEnd);
        }
        return res;
        
    }
}
