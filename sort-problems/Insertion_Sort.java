O(n^2)
class Solution {
    public int[] sortArray(int[] nums) {
        int temp,key=1,j=1;
        while(j<nums.length){
            if(nums[j]<nums[j-1]){
                temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                if(j>1) {
                    j--;
                }else{
                    j = ++key;
                } 
            }else{
                j = ++key;
            }
        }

        return nums;
    }
}