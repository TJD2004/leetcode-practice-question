// 153. Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1 || nums[0] < nums[n - 1]) {
            return nums[0];
        }

        int s = 0;
        int e = n-1;

        while(s <= e) {
            int mid = s + (e-s) / 2;
            if(mid + 1 < n && mid - 1 >= 0 && nums[mid - 1] > nums[mid] && nums[mid + 1] > nums[mid]) {
                return nums[mid];
            }
            if(nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return nums[s];
    }
}