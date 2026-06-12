class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mapper = new HashMap<>();
        for(char a : s.toCharArray()){
            if(mapper.containsKey(a)){
                mapper.put(a,mapper.get(a)+1);
            } else{
                mapper.put(a,1);
            }
        }
        for(char a : t.toCharArray()){
            if(mapper.containsKey(a)){
                mapper.put(a,mapper.get(a)-1);
            } else{
                return false;
            }
        }
        for(Integer b : mapper.values()){
            if(b != 0){
                return false;
            }
        }
        return true;
    }
}
