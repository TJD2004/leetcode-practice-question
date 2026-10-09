// 410. Split Array Largest Sum

class Solution {
    static boolean isValid(int[] nums, int k, int mid) {
        int max = 0;
        int i = 0;
        int sa = 0;

        while (i < nums.length) {
            max += nums[i];
            if (max > mid) {
                max -= nums[i];
                max = nums[i];
                sa++;
            }
            i++;
        }
        if (sa + 1 > k) {
            return false;
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int s = 0;

        for (int x : nums) {
            sum += x;
            s = Math.max(s, x);
        }

        int e = sum;

        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < s) {
                break;
            }
            if (isValid(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}