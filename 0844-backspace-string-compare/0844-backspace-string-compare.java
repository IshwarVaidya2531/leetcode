class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sSkip=0 ,tSkip=0, l = s.length()-1, j = t.length()-1;
        while(l >=0 || j >=0){
            while(l>=0 && (s.charAt(l) == '#' || sSkip>0)){
                if(s.charAt(l) =='#'){
                    sSkip++; l--;
                }else{
                    sSkip--; l--;
                }
            }

            while(j>=0 && (t.charAt(j) == '#' || tSkip>0)){
                if(t.charAt(j) =='#'){
                    tSkip++; j--;
                }else{
                    tSkip--; j--;
                }
            }
        if((l<0 && j >=0) || (j<0 && l >=0)) return false;
        if(l>=0 && j >=0 && s.charAt(l) != t.charAt(j)) return false;
        l--; j--;
        }
        return true;
    }
}