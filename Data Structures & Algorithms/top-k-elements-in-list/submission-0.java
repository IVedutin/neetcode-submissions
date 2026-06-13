class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        Map<Integer,Integer> mapper = new HashMap<>();
        for(int num : nums){
            if(mapper.containsKey(num)){
                mapper.put(num,mapper.get(num)+1);
            } else{
                mapper.put(num,1);
            }
        }
        List<Map.Entry<Integer, Integer>> mapik = new ArrayList<>(mapper.entrySet());
        mapik.sort((a, b) -> b.getValue() - a.getValue());
        int[] answer = new int[k];

        for(int i = 0 ; i < k ; i++){
            answer[i] = mapik.get(i).getKey();
        }
        return answer;
    }
}
