class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lister = new ArrayList<>();
        Set<List<Integer>> setter = new HashSet<>();
        for(int i = 0 ; i < nums.length - 2 ; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[left] + nums[right] == -nums[i]){
                    List<Integer> listik = new ArrayList<>();
                    listik.add(nums[left]);
                    listik.add(nums[right]);
                    listik.add(nums[i]);
                    setter.add(listik);
                    left++;
                    right--;
                } else if(nums[left] + nums[right] < -nums[i]){
                    left++;
                } else{
                    right--;
                }
                
            }
        }
        for(List<Integer> lst : setter){
            lister.add(lst);
        }
        return lister;
    }
}
