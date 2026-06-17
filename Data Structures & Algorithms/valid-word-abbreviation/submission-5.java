class Solution {
    public static boolean validWordAbbreviation(String word, String abbr) {
        if(word.equals(abbr)){
            return true;
        }
        int w = 0;
        int a = 0;
        while(w < word.length() && a < abbr.length()){
            if(word.charAt(w) == abbr.charAt(a)){
                w++;
                a++;
            } else if(word.charAt(w) != abbr.charAt(a) && Character.isDigit(abbr.charAt(a))){
                String numberStr = String.valueOf(abbr.charAt(a));
                if(numberStr.equals("0")){
                    return false;
                }
                while(a < abbr.length() && a+1 < abbr.length() && Character.isDigit(abbr.charAt(a+1))){
                    a++;
                    numberStr += abbr.charAt(a);
                }
                a++;
                int numb = Integer.parseInt(numberStr);
                w+= numb;
            }
            else if(word.charAt(w) != abbr.charAt(a)) {
                return false;
            }
        }
        return w == word.length() && a == abbr.length();
    }
}