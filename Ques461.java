// 461. Hamming Distance


class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;

        while(x != 0 && y != 0) {
            int bit_x = x%2;
            int bit_y = y%2;
            if(bit_x != bit_y) {
                count++;
            }
            x/=2;
            y/=2;
        }
        
        return count;
    }
}