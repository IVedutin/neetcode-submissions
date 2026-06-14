class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){return 0;}
        Set<Integer> setter = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            setter.add(nums[i]);
        }
        int k = 0;
        int[] numbs = new int[setter.size()];
        for(Integer a : setter){
            numbs[k] = a;
            k++;
        }
        Arrays.sort(numbs);
        int left = 0;
        int right = 1;
        int maxLen = 1;
        while(right < numbs.length){
            if(numbs[right] - numbs[right-1] != 1){
                left=right;
            }
            else{
                maxLen = (right - left+1) > maxLen? (right - left+1) : maxLen;
            } 
            right++;
        }
        return maxLen;
    }
}
