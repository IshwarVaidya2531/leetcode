class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> noLose = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int[] team : matches){
            map.put(team[0], map.getOrDefault(team[0], 0)+0);
            map.put(team[1], map.getOrDefault(team[1], 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 0){
                noLose.add(key);
            }else if(map.get(key) == 1){
                oneLose.add(key);
            }
        }
        Collections.sort(noLose);
        Collections.sort(oneLose);

        return Arrays.asList(noLose,oneLose);
    }
}