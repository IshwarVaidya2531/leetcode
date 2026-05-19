class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int size = temp.length;
        int[] res = new int[size];
        Arrays.fill(res,0);
        for(int i=0; i < size;i++){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                int poped = stack.pop();
                res[poped] = i - poped;
            }
             stack.push(i);
        }
        return res;
    }
}