// 80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++) {
            if(i+1 < nums.length && nums[i] != nums[i+1]) {
                if(cnt < 2) {
                    nums[idx++] = nums[i];
                }
                cnt = 0;
            } else {
                if(cnt < 2) {
                    nums[idx++] = nums[i];
                }
                cnt++;
            }
        }

        return idx;
    }
}