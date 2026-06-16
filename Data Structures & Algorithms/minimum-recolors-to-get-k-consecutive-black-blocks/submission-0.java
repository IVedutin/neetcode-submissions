class Solution {
    public int minimumRecolors(String blocks, int k) {
        int replaces = 0;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                replaces++;
            }
        }
        int l = 1;
        int r = k;
        int result = replaces;
        while(l <= blocks.length() - k){
            if(blocks.charAt(l-1) == 'W'){
                replaces--;
            }
            if(blocks.charAt(r) == 'W'){
                replaces++;
            } 
            result = result > replaces? replaces : result;
            l++;
            r++;
        }
        return result;
    }
}