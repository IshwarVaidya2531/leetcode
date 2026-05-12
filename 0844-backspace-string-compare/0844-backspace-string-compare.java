class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '#'){
               if(!ss.isEmpty()) ss.pop();
            }else{
                ss.push(c);
            }
        }
        for(char c : t.toCharArray()){
            if(c == '#'){
               if(!tt.isEmpty()) tt.pop();
            }else{
                tt.push(c);
            }
        }
        return ss.equals(tt);
    }
}