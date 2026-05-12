class Solution {
    public String removeDuplicates(String s) {

        // Approach 1
        // StringBuilder res = new StringBuilder();
        // if(s.length() == 1) return s;
        // for(char c : s.toCharArray()){
        //     if(res.length() > 0 && (c == res.charAt(res.length()-1))){
        //         res.deleteCharAt(res.length()-1);
        //     }else{
        //         res = res.append(c);
        //     }
        // }
        // return res.toString();

        // Approach 2

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(c == stack.peek()){
                 stack.pop();  
            }else{   
             stack.push(c); 
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}