// 1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            int j = 0;
            int cnt = 0;
            while(j < n){
                if(nums[i] > nums[j]) {
                    cnt++;
                }
                j++;
            }

            ans[i] = cnt;
        }

        return ans;
    }
}