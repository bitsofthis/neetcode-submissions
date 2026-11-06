class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Return string directly if there is only 1.
        if(strs.length == 1){
            return strs[0];
        }

        // If we sort, we can be sure that whatever prefix
        // the first and last strings share, the others have as well.
        // Otherwise they would have to occur before or after
        // the first or last string.
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        String commonPrefix = "";

        // In order to avoid going out of bounds.
        int lengthShortest = 0;

        if(first.length() < last.length()){
            lengthShortest = first.length();
        }

        else if(last.length() < first.length()){
            lengthShortest = last.length();
        }

        else{
            lengthShortest = first.length(); // Can be either since they are equal.
        }

        for(int i = 0; i < lengthShortest; i++){
            String letterFirstStr = String.valueOf(first.charAt(i));
        
            String letterLastStr = String.valueOf(last.charAt(i));

            // Stop comparing once there is no match.
            if(letterFirstStr.equals(letterLastStr) == false){
                return commonPrefix;
            }
            // Else add to the output string.
            commonPrefix += letterFirstStr;
        }

        return commonPrefix;

    }
}