// 29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long ans = 0;

        while (a >= b) {

            int cnt = 0;

            while (a >= (b << (cnt + 1))) {
                cnt++;
            }

            ans += (1L << cnt);
            a -= (b << cnt);
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }

        return (int) ans;
    }
}
