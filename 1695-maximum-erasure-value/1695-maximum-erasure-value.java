class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left =0, right =0, sum=0,res=0;
        Set<Integer> set = new HashSet<>();
        for(; right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+= nums[right];
            res = Math.max(res, sum);
        }
        return res;
    }
}