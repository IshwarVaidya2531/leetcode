class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        String[] arr = trimmed.split(" ");
       return arr[arr.length -1].length(); 
        
    }
}