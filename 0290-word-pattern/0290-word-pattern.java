class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] list = s.split(" ");
        if(pattern.length() != list.length) return false;
        for(int i =0; i< pattern.length();i++){
            char ch = pattern.charAt(i);
            String str = list[i];
            if((map.containsKey(ch) && !map.get(ch).equals(str)) ||(!map.containsKey(ch) && map.values().contains(str))){
                return false;
            }
            map.put(ch,str);
        }
        return true;
    }
}