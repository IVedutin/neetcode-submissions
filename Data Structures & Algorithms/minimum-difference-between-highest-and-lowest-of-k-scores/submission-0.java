class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = l+k-1;
        int minRes = Integer.MAX_VALUE;
        while(l < nums.length - k+1){
            int[] a = Arrays.copyOfRange(nums, l, r+1); 
            int maxix = Arrays.stream(a).max().getAsInt();
            int minix = Arrays.stream(a).min().getAsInt();
            minRes = minRes > (maxix - minix)? (maxix - minix) : minRes;
            l++;
            r++;
        }
        return minRes;
    }
}