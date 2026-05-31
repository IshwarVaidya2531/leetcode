class Solution {
    public String robotWithString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char[] minSuffix = new char[n+1];
        Arrays.fill(minSuffix, 'z');
        for(int i =n-1; i >=0 ; i--){
            minSuffix[i] = (char) Math.min(minSuffix[i+1], s.charAt(i));
        }
        for(int i =0; i < n ; i++){
            stack.push(s.charAt(i));
            while(!stack.isEmpty() && stack.peek() <= minSuffix[i+1]){
                sb.append(stack.pop());
            }
        }

        return sb.toString();
    }
}