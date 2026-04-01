class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char ch : ransomNote.toCharArray()){
            arr[ch - 'a']++;
        }
        for(char ch : magazine.toCharArray()){
            arr[ch - 'a']--;
        }
        for(int i : arr){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}