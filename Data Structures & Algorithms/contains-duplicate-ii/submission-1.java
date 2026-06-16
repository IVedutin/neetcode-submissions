class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> setter = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(setter.contains(nums[i])){
                return true;
            }
            setter.add(nums[i]);

            if(setter.size() > k){
                setter.remove(nums[i-k]);
            }
        }
        return false;
        
    }
}