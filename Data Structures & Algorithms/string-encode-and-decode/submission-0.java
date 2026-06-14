class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()+";");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> lister = new ArrayList<>();
        int left = 0;
        int right = 0;
        while(left < str.length()){
            right = left;
            while(right < str.length() && str.charAt(right)!=';'){
                right++;
            }
            int substring = Integer.parseInt(str.substring(left,right));
            int amount = right - left;
            left = right + 1;
            right = left + substring;
            lister.add(str.substring(left,right));
            left = right;

        }
        return lister;
    }
}
