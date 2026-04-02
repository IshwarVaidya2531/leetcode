class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res =0;
        for(Character i : jewels.toCharArray()){
            for(Character j : stones.toCharArray()){
             if(i == j) res++;
           }
        }
        return res;
    }
}