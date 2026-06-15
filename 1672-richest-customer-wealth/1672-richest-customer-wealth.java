class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int[] bank : accounts){
            int rowCount =0;
            for(int amount : bank){
                rowCount += amount;
            }
            maxWealth = Math.max(maxWealth, rowCount);
        }

        return maxWealth;
    }
}