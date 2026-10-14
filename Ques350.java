// 350. Intersection of Two Arrays II


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        Arrays.fill(freq, 0);

        for(int x : nums2) {
            freq[x]++;
        }

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;

        for(int y : nums1) {
            if(freq[y] > 0) {
                ans[idx++] = y;
                freq[y]--;
            }
        }

        return Arrays.copyOf(ans, idx);
    }
}