// 327. Count of Range Sum

/* Brute Force Solution (TLE) */

class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        int count = 0;
        int sum = 0;

        for(int x : nums) sum += x;

        for(int i=0; i<n; i++) {
            int j = n-1;
            long currSum = sum;
            while(j >= i) {
                if(currSum >= lower && currSum <= upper) {
                    count++;
                }
                currSum -= nums[j--];
            }
            sum -= nums[i];
        }

        return count;
    }
}