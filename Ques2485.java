// 2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        if(n == 1) {
            return 1;
        }
        int t_sum = 0;
        for(int i=1; i<=n; i++) {
            t_sum += i;
        }

        int l_sum = 0;
        for(int i=1; i<= n; i++) {
            l_sum += i;
            if(l_sum == t_sum) {
                return i;
            }
            t_sum -= i;
        }

        return -1;
    }
}