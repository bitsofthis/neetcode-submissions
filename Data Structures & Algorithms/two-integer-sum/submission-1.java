class Solution {
    public int[] twoSum(int[] nums, int target) {

       int[] toReturn = new int[2];

       for(int i = 0; i < nums.length; i++){

           for(int ni = i + 1; ni < nums.length; ni++){

                if(nums[i] + nums[ni] == target){
                    toReturn[0] = i;
                    toReturn[1] = ni;
                }
           }
       }

       return toReturn;
    }
}
