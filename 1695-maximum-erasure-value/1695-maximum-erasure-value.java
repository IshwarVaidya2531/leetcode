class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left =0, sum=0,res=0;
        Set<Integer> set = new HashSet<>();
        for(int right=0; right<nums.length;right++){
            while(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            sum+= nums[right];
            res = Math.max(res, sum);
        }
        return res;
    }
}