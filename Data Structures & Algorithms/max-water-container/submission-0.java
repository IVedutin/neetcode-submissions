class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int area = 0;
        while(left < right){
            int localArea = Math.min(heights[left],heights[right]) * (right - left);
            area = localArea > area? localArea : area;
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
