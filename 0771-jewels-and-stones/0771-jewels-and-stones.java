class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int res =0;
        for(Character ch : jewels.toCharArray()){
            set.add(ch);
        }
        for(Character ch : stones.toCharArray()){
            if(set.contains(ch)){
                res++;
            }
        }
        return res;
    }
}