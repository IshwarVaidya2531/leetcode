class Solution {
    public int findLucky(int[] arr) {
        int[] ca = new int[501];
        for(int i : arr){
            ca[i]++;
        }
        for(int i = 500; i > 0;i--){
            if(i == ca[i]) return i;
        }
        return -1;
    }
}