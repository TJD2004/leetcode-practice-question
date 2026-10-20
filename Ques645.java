// 645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int zeroFreq = 0;
        int repeat = 0;

        int[] freq = new int[nums.length+1];

        Arrays.fill(freq, 0);

        for(int x : nums) {
            freq[x]++;
        }

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                repeat = i;
            }
            if (freq[i] == 0) {
                zeroFreq = i;
            }
        }

        return new int[] {repeat, zeroFreq};
    }
}