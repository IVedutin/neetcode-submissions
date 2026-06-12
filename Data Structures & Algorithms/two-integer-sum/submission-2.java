class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapper = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int result = target - nums[i];
            if(mapper.containsKey(result)){
                return new int[]{mapper.get(result),i};
            } else{
                mapper.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
