class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet();
        int x=0, y=0;
        set.add("0 , 0");
        for(char c : path.toCharArray()){
            switch(c){
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                break;
            }
            String cordinate = x +" , "+y;
            if(set.contains(cordinate)) return true;
            set.add(cordinate);
        }
        return false;
    }
}