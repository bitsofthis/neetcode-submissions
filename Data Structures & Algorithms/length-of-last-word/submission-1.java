class Solution {
    public int lengthOfLastWord(String s) {
        
        String sTrim = s.trim();

        String word = "";

        // Since we trimmed leading and trailing spaces, we can begin at the last index, 
        // which is the end of the last word.
        for(int i = sTrim.length() - 1; i >= 0; i--){

            String current = String.valueOf(sTrim.charAt(i));

            // Stop at the first occurence of a space.
            if(current.equals(" ")){
                break;
            }

            // Build out the last word letter by letter until we hit a space.
            // Word is reversed but it does not matter for finding the length.
            word += current;
        }

        return word.length();
    }
}