/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        
        for(char c : t.toCharArray()){
            if(count[c - 'a'] ==0){
                return false;
            }
            
            count[c - 'a']--;
        }
        
        for(int i=0; i< 26; i++){
            if(count[i] !=0)
                return false;
        }
        
        return true;
    }
}
