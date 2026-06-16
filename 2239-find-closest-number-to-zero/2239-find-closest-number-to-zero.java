class Solution {
    public int findClosestNumber(int[] nums) {
        int res =nums[0];

        for(int i=1; i < nums.length;i++){
            if(Math.abs(nums[i]) < Math.abs(res)){
                res = nums[i];
            }else if(Math.abs(nums[i]) == Math.abs(res) && nums[i] > 0){
                res = nums[i];
            }
        }
        return res;
    }
}