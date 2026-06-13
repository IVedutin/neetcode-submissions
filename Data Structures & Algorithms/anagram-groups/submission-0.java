class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapper = new HashMap<>();
        for(String letter : strs){
            char[] letters = letter.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(mapper.containsKey(key)){
                mapper.get(key).add(letter);
            }else{
                List<String> listik = new ArrayList<>();
                listik.add(letter);
                mapper.put(key,listik);
        }
        }
        return new ArrayList<>(mapper.values());
    }
}
