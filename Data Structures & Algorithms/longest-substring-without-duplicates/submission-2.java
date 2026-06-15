class Solution {
    public boolean containsDuplicate(String s, int i, int j){
        char[] substr = s.substring(i,j+1).toCharArray();
        Set<Character> setter = new HashSet<>();
        for(char a : substr){
            setter.add(a);
        }
        if(setter.size() == substr.length){
            return true;
        } else{
            return false;
        }
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxLen = 1;
        int slow = 0;
        for(int fast = 1 ; fast < s.length() ; fast++){
            if(containsDuplicate(s,slow,fast)){
               maxLen = fast - slow + 1> maxLen? fast - slow + 1 : maxLen;
            } else{
                slow++;
            }
        }
        return maxLen;
    }
}
