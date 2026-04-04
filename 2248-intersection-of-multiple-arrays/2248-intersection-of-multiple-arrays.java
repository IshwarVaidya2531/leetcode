class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int[] arr : nums){
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        return map.keySet().stream().filter(i -> map.get(i) == n).sorted().toList();
        
    }
}