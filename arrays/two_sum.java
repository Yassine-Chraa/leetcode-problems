class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int sum = 0;
        int[] ret= new int[2];
        for(int i=0;i<length-1;i++){
            for(int k=1;k<length-i;k++){
                sum = nums[i]+nums[i+k];
                if(sum == target){
                    ret[0] = i;
                    ret[1] = i+k;
                    break;
                }
            }
        }
        return ret;
    }
}