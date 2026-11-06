class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length * 2];

        int numsCounter = 0;

        for(int i = 0; i < ans.length; i++){
            
            // Reset the separate index so we don't go out of bounds for nums,
            // while continuing to add it's elements to ans.
            if(numsCounter == nums.length){
                numsCounter = 0;
            }

            ans[i] = nums[numsCounter];
            numsCounter++;
        }

        return ans;
    }
}