class Solution {
    public boolean isAnagram(String s, String t) {

        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        // Save individual characters from strings to an array of char's.
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort them numerically so that characters line up.
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Convert back to a String so we can easily compare with .equals().
        String sSorted = new String(sArr);
        String tSorted = new String(tArr);

        if(sSorted.equals(tSorted)){
            return true;
        }

        return false;

    }
}
