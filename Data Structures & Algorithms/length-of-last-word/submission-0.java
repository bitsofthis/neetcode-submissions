class Solution {
    public int lengthOfLastWord(String s) {
        
        String sTrim = s.trim();

        String word = "";

        for(int i = sTrim.length() - 1; i >= 0; i--){

            String current = String.valueOf(sTrim.charAt(i));

            if(current.equals(" ")){
                break;
            }

            word += current;
        }

        return word.length();
    }
}