class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != prev){
                nums[count++] = nums[i];
                prev = nums[i];
            }
        }
        return count;
    }
}