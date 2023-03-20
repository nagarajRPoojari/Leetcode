// https://leetcode.com/problems/find-triangular-sum-of-an-array

class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            ans[i]=(nums[i]+nums[i+1])%10;
        }
        return triangularSum(ans);
    }
}