// 852. Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int ans = 0;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] < arr[mid+1]) {
                l = mid+1;
            } else {
                ans = mid;
                r = mid-1;
            }
        }

        return ans;
    }
}