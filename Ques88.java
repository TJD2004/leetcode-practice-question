// 88. Merge Sorted Array

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n + m];
        int idx = 0;

        int i=0, j=0;

        while(i < m && j < n) {
            if(nums1[i] > nums2[j]) {
                temp[idx++] = nums2[j++];
            } else {
                temp[idx++] = nums1[i++];
            }
        }

        while(i < m) {
            temp[idx++] = nums1[i++];
        }

        while(j < n) {
            temp[idx++] = nums2[j++];
        }

        idx = 0;

        for (int k : temp) {
            nums1[idx++] = k;
        }
    }
}
