// 485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount = 0;
        int maxOnes = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                oneCount++;
            } else {
                maxOnes = Math.max(oneCount, maxOnes);
                oneCount = 0;
            }
        }

        maxOnes = Math.max(oneCount, maxOnes);

        return maxOnes;
    }
}