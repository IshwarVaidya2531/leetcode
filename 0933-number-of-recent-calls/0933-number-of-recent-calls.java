class RecentCounter {
    
    // Approach 1

        //     List<Integer> list;
        //    int i;
        //     int j;
        //     public RecentCounter() {
        //          list = new ArrayList();
        //          i =0;
        //          j =-1;
        //     }
        //     public int ping(int t) {
        //       j++;
        //       list.add(t);
        //       while(i<j && (list.get(j) - 3000 > list.get(i))){
        //          i++;
        //      }
        //      return j - i +1;
        //      }
    
    // Approach 2 

     Queue<Integer> queue;
       public RecentCounter() {
            queue = new LinkedList();
        }

        public int ping(int t) {
            queue.add(t);
            while(!queue.isEmpty() && (t - 3000 > queue.peek())){
                queue.poll();
            }
            return queue.size();
        }
        

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */