// 69. Sqrt(x);

class Solution {
    public int sqrt(int x) {
        int l=0;
        int r=x;

        while(l <= r) {
            if((long) mid*mid <= x) {
                r = mid - 1;
            } else {
                l = mid+1;
            }
        }

        return r;
    }
}