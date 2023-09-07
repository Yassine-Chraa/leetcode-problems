class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public void quickSort(int[] arr,int start,int end){
        int i=start,j=start,c;
        int pivot = arr[end];
        while(j<end){
            if(arr[j]<=pivot){
                c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
            }
            j++;
        }

        if(i<end){
            c = arr[i];
            arr[i] = pivot;
            arr[end] = c;
        }

        if(start<i-1) quickSort(arr,start,i-1);
        if(i+1<end) quickSort(arr,i+1,end);
    }
}