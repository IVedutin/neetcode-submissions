class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while(left < right){
            if(!(Character.isDigit(s.charAt(left)) || Character.isLetter(s.charAt(left)))){
                left++;
            } 
            else if(!(Character.isDigit(s.charAt(right)) || Character.isLetter(s.charAt(right)))){
                right--;
            } 
            else if(s.charAt(left) != (s.charAt(right))){
                return false;
            }
            else{right--;
            left++;}

        }
        return true;
    }
}
