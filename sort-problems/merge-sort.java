class Solution {

  public int[] sortArray(int[] nums) {
    int n = nums.length;
    int m = n % 2 == 0 ? n / 2 : (n / 2) + 1;
    int[] left = new int[m], right = new int[n - m];

    for (int i = 0; i < m; i++) {
      left[i] = nums[i];
    }
    for (int i = m; i < n; i++) {
      right[i - m] = nums[i];
    }

    if (m >= 2) {
      sortArray(left);
    }
    if (n - m >= 2) {
      sortArray(right);
    }

    merge(nums, left, right);
    return nums;
  }

  public void merge(int[] arr, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }
    while (i < left.length) {
      arr[k++] = left[i++];
    }

    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }
}
