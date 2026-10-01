// 9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int rev = 0;
        int num = x;

        while(x != 0) {
            rev = rev*10 + x % 10;
            x /= 10;
        }

        if(num == rev) {
            return true;
        }

        return false;
    }
}