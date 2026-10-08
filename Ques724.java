// 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int t_sum = 0;
        for(int x : nums) {
            t_sum += x;
        } 

        int left_sum =0;

        for(int i=0; i<nums.length; i++) {
            t_sum -= nums[i];
            if(left_sum == t_sum) {
                return i;
            }
            left_sum += nums[i];
        }

        return -1;
    }
}