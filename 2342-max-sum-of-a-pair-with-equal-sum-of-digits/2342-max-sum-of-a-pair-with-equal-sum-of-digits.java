class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int res = -1, i=0;
        for(; i < nums.length;i++){
            int s = sum(nums[i]);
            if(map.containsKey(s)){
                res = Math.max(res, nums[i] + map.get(s));
                if(nums[i]> map.get(s)){
                    map.put(s,nums[i]);
                }
            }else{
                map.put(s,nums[i]);
            }
        }
        return res;
        
    }

    private int sum(int num){
        int sum =0;
        while(num > 0){
            sum += num %10;
            num = num /10;
        }
        return sum;
    }
}