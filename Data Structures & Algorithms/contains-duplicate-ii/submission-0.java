class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        int r = 1;
        while(l < nums.length-1){
            r = l + 1;
            while(r<l+k+1 && r < nums.length){
                if (nums[l] == nums[r]){
                    return true;
                } else{
                    r++;
                }
            }
            l++;
        }
        return false;
        
    }
}