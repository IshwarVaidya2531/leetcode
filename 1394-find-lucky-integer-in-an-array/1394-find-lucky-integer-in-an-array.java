class Solution {
    public int findLucky(int[] arr) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for(int i : set){
            if(i == map.get(i)) {
                res = Math.max(res, i);
            };
        }
        return res != 0 ? res : -1 ;
    }
}