class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int h = 0;
        int l = 0;
        boolean w1 = false;
        boolean w2 = false;
        while(h < word1.length() && l < word2.length()){
            sb.append(word1.charAt(h));
            sb.append(word2.charAt(l));
            h++;
            l++;
            if(h >= word1.length()){
                w1 = true;
            }
            if(l >= word2.length()){
                w2 = true;
            }
        }
        if(w1 && !w2){
            while(l<word2.length()){
                sb.append(word2.charAt(l));
                l++;
            }
            return sb.toString();
        } else if(!w1 && w2){
            while(h<word1.length()){
                sb.append(word1.charAt(h));
                h++;
            }
            return sb.toString();
        }
        else{
            return sb.toString();
        }
    }
}