// 275. H-Index II

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (citations[mid] >= n - mid) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return n - s;
    }
}