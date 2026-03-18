class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res =0;
        nums.sort((a,b) -> a-b);
        int l=0;
        int r =nums.size()-1;
        while(l != r){
            if(nums.get(l) + nums.get(r) < target){
                res += r-l;
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}