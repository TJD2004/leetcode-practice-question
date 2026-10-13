// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];
        Arrays.fill(freq, 0);

        for(int x : nums) {
            freq[x]++;
        }

        for(int x : nums) {
            if(freq[x] >= 2) {
                return x;
            }
        }

        return -1;
    }
}