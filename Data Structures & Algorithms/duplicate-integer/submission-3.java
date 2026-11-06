class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for(int i = 0; i + 1 < nums.length; i++){

            for(int ni = i + 1; ni < nums.length; ni++){

                if(nums[i] == nums[ni]){
                    return true;
                }
            }
        }

        return false;
    }
}