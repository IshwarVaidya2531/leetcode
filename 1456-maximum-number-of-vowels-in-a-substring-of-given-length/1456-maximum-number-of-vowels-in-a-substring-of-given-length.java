class Solution {
    public int maxVowels(String s, int k) {
        int l =0; int r=0; int res=0; int window = 0;
        for(;r<k;r++){
            window += isVowel(s.charAt(r));
        }
        res = window;

        while(r<s.length()){
            window -= isVowel(s.charAt(l++));
            window += isVowel(s.charAt(r++));
            res = Math.max(res, window);
        }
        return res;
    }
    
    public int isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1:0;
    }
}