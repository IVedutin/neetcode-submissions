class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mapper = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(mapper.containsKey(nums[i])){
                return true;
            } else{
                mapper.put(nums[i],1);
            }
        }
        return false;
    }
}