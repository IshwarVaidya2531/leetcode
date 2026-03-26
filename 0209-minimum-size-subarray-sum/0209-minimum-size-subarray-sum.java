class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, res = Integer.MAX_VALUE, left = 0, right=0, window =0;
        for(;right<n;right++){
            window += nums[right];
            while(window>= target){
            res = Math.min(res,right-left+1);
            window -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res; 
    }
}