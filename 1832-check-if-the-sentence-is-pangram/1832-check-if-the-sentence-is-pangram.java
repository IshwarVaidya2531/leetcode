class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26) return false;
        Set<Character> set = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size() == 26;
    }
}