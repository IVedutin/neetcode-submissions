class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = k-1;
        int minRes = Integer.MAX_VALUE;
        while(l < nums.length - k+1){
            minRes = minRes > (nums[r] - nums[l])? (nums[r] - nums[l]) : minRes;
            l++;
            r++;
        }
        return minRes;
    }
}