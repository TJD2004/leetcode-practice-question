// 1470. Shuffle the Array


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;

        int[] ans = new int[nums.length];

        int idx = 0;
        while(i < n && j < nums.length && idx < nums.length) {
            ans[idx++] = nums[i++];
            ans[idx++] = nums[j++];
        }

        return ans;
    }
}