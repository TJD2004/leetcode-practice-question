// 300. Longest Increasing Subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> tails = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (tails.isEmpty()) {
                tails.add(nums[i]);
            } else if (nums[i] > tails.get(tails.size() - 1)) {
                tails.add(nums[i]);
            } else {
                int s = 0;
                int e = tails.size() - 1;

                while (s <= e) {
                    int mid = s + (e - s) / 2;
                    if (tails.get(mid) >= nums[i]) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }

                tails.set(s, nums[i]);
            }
        }

        return tails.size();
    }
}