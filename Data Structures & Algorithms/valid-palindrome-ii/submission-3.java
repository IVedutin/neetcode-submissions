class Solution {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        boolean isDeleted = false;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)) {
                return(isPali(s,left+1,right) || isPali(s,left,right-1));
            }
            else{
                left++;
                right--;
            }
        }
        return true;

    }

    public static boolean isPali(String s , int left , int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}