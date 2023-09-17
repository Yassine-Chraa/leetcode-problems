class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int k=0;k<matrix.length;k++){
            if(binarySearch(matrix[k],target))  return true;
        }
        return false;
    }

    public boolean binarySearch(int[] arr,int target){
        int start=0,end=arr.length-1,m;

        while(start<=end){
            m = start + (end-start)/2;
            if(m==end){
                return arr[m] == target;
            }
            if(target<arr[m]){
                end = m-1;
            }
            else if(target>arr[m]){
                start = m+1;
            }
            else{
                return true; 
            }
        }

        return false;
    }
}