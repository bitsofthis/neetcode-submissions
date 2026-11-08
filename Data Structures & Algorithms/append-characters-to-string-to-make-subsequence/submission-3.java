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
            // If t is not a full subsuquence of s,
            // then everything from tPoint to the end of t should be appended to
            // the end of s, in order to make t a subsequence of s.
            return t.substring(tPoint).length();
        }

        // If t is a subsequence of s, then we don't need to append anything.
        return 0;
    }
}