class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        int[] arr = new int[101];
        for(int i : nums){
            arr[i]++;
        }
        for(int i=0; i< 101 -k ;i++){
            res += arr[i] * arr[i+k];
        }
        return res;
    }
}