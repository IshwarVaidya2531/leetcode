class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(c - stack.peek()) == 32){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}