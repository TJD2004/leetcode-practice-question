// 3727. Maximum Alternating Sum of Squares


class Solution {
    public long maxAlternatingSum(int[] num) {
        int n = num.length;
        long nums[]=new long[n];
        for(int i = 0; i < n; i++) {
            nums[i] = num[i]*num[i];
        }

        Arrays.sort(nums);
        long maxSum = 0;

        int s = 0;
        int e = n - 1;


        while(s < e) {
            maxSum += nums[e--];
            maxSum -= nums[s++];
        }

        if((n & 1) == 1) {
            return maxSum + nums[s];
        } 
        return maxSum;
    }
}