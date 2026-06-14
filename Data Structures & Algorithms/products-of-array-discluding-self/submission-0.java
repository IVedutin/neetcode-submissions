class Solution {
    public int[] productExceptSelf(int[] nums) {
        int production = 1;
        for(int i = 0 ; i < nums.length ; i++){
            production*= nums[i];
        }
        int[] numb = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            if(numb[i] != 0){
                numb[i] = production / nums[i];
            } else{
                int prods = 1;
                for(int j = 0 ; j < nums.length; j++){
                    if(j==i){
                        continue;
                    }
                    prods*=nums[j];
                }
                numb[i] = prods;
            }   
        }
        return numb;
    }
}  
