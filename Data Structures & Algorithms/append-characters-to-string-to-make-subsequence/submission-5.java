class Solution {
    public int appendCharacters(String s, String t) {

        int sPoint = 0;
        int tPoint = 0;

        while(sPoint < s.length() && tPoint < t.length()){

            if(t.charAt(tPoint) == s.charAt(sPoint)){
                tPoint++;
                sPoint++;
                continue;
            }

            sPoint++;
        }

        if(tPoint < t.length()){
            return t.substring(tPoint).length();
        }
        
        return 0;
    }
}