class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] count = new int[26];
        for(char ch : order.toCharArray()){
            set.add(ch);
        }
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
            }else{
                count[ch - 'a']++;
            }
        }
        for(char ch : order.toCharArray()){
            int i = count[ch -'a'];
            while(i-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}