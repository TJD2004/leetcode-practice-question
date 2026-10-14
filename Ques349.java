// 349. Intersection of Two Arrays
import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for (int x : nums2) {
            freq[x]++;
        }

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;

        for (int y : nums1) {
            if (freq[y] > 0) {
                ans[idx++] = y;
                freq[y] = 0;
            }
        }

        return Arrays.copyOf(ans, idx);
    }
}