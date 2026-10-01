#include <iostream>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        // Reverse half of the number
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        // If x has even number of digits, x == reverse
        // If x has odd number of digits, x == reverse / 10 (middle digit doesn't matter)
        return x == reverse || x == reverse / 10;
    }
};

int main() {
    Solution sol;

    // Test cases
    int test1 = 121;
    int test2 = -121;
    int test3 = 10;
    int test4 = 12321;

    cout << test1 << " is palindrome? " << (sol.isPalindrome(test1) ? "Yes" : "No") << endl;
    cout << test2 << " is palindrome? " << (sol.isPalindrome(test2) ? "Yes" : "No") << endl;
    cout << test3 << " is palindrome? " << (sol.isPalindrome(test3) ? "Yes" : "No") << endl;
    cout << test4 << " is palindrome? " << (sol.isPalindrome(test4) ? "Yes" : "No") << endl;

    return 0;
}
