class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        if(s.length() == 1) return s;
        for(char c : s.toCharArray()){
            if(res.length() > 0 && (c == res.charAt(res.length()-1))){
                res.deleteCharAt(res.length()-1);
            }else{
                res = res.append(c);
            }
        }
        return new String(res);
    }
}