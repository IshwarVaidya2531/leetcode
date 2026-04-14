class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res =0,cur =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            cur +=i;
            res += map.getOrDefault(cur - goal,0);
            map.put(cur, map.getOrDefault(cur, 0)+1);
        }
        return res;
    }
}