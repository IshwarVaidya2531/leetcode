class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = cards.length, i =0;
        int res = Integer.MAX_VALUE;
        for(; i < n;i++){
            if(map.containsKey(cards[i]))
                res = Math.min(res, i - map.get(cards[i]) + 1);
            
            map.put(cards[i], i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}