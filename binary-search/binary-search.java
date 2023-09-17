class Solution {
    public int search(int[] nums, int target) {
        return recursion(nums,0,nums.length-1,target);
    }
    public int recursion(int[] nums, int start,int end,int target){
        int m = start + (end-start)/2;
        if(start<=end){
            if(target<nums[m]){
                return recursion(nums,start,m-1,target);
            }
            else if(target>nums[m]){
                return recursion(nums,m+1,end,target);
            }
            else{
                return m;
            }
        }else{
            return -1;
        }
    }
}