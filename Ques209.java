// 209. Minimum Size Subarray Sum


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int s = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int e = 0; e < n; e++) {
            sum += nums[e];

            while (sum >= target) {
                minLen = Math.min(minLen, e - s + 1);
                sum -= nums[s];
                s++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}