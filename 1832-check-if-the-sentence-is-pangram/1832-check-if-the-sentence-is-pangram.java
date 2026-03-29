class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> set = new HashSet<>();
        if(s.length()<26) return false;
        for(int i =0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size() == 26;
    }
}