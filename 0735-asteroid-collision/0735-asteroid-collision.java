class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();
        boolean shouldPushed = true;
        for(int i=0; i < a.length; i++){
            shouldPushed = true;
            while(!stack.isEmpty()){
                int peek = stack.peek();
                if(peek > 0 && peek == a[i] * -1){
                    stack.pop();
                    shouldPushed = false;
                    break;
                }else if(peek == a[i] || peek * a[i] > 0 || (peek < 0 && a[i] > 0)){
                    break;
                }else if(Math.abs(peek) < Math.abs(a[i])){
                    stack.pop();
                }else if (Math.abs(peek) > Math.abs(a[i])){
                    shouldPushed = false;
                    break;
                }
            }
            if(shouldPushed){
                stack.push(a[i]);
            }
        }

        int[] res = new int[stack.size()];
        int idx =0;
        for(int i : stack){
            res[idx] = i;
            idx++;
        }
        return res;
    }
}