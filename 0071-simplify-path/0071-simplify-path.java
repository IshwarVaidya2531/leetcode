class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(String s : arr){
            if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!s.equals(".") && !s.equals("") && !s.equals("..")){
                stack.push(s);
            }
        }
        for(String str : stack){
            sb.append("/");
            sb.append(str);
        }
        return sb.length() == 0 ? "/" : sb.toString();
        
    }
}