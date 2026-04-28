class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        if(s.length() == 1) return s;
        for(int i=0;i<s.length();i++){
            if(res.length() > 0 && (s.charAt(i) == res.charAt(res.length()-1))){
                res.deleteCharAt(res.length()-1);
            }else{
                res = res.append(s.charAt(i));
            }
        }
        return new String(res);
    }
}