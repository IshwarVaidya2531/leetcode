class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left =0, right =0, window=0, ans =-1;
        for(;right<s.length();right++){
            window += Math.abs(s.charAt(right) - t.charAt(right));
            while(window > maxCost){
                window -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            ans = Math.max(ans, right - left +1);
        }
        return ans;
    }
}