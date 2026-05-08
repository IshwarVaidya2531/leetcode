class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        long window=0;
        int kk =k;
        int idx = 2*k+1;
        if(idx > n) return res;
        for(int i =0; i<idx ;i++){
            window+= nums[i];
        }
        res[kk] = (int) (window / idx);
        for(int i = idx; i<n; i++){
            window = window - nums[i-idx] + nums[i];
            res[++kk] = (int) (window / idx);
        }
        return res;
    }
}