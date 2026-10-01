#include <iostream>
#include <climits>  // For INT_MAX and INT_MIN

using namespace std;

class Solution {
public:
    int reverse(int x) {
        long reverse_number = 0;

        while (x != 0) {
            int remainder = x % 10;
            x = x / 10;

            long rev = reverse_number * 10 + remainder;
            
            // Check for overflow
            if (rev > INT_MAX || rev < INT_MIN) {
                return 0;
            }

            reverse_number = rev;
        }

        return (int)reverse_number;
    }
};

int main() {
    Solution sol;

    // Test cases
    int test1 = 123;
    int test2 = -456;
    int test3 = 1534236469;  // Causes overflow

    cout << "Reverse of " << test1 << " is " << sol.reverse(test1) << endl;
    cout << "Reverse of " << test2 << " is " << sol.reverse(test2) << endl;
    cout << "Reverse of " << test3 << " is " << sol.reverse(test3) << endl;

    return 0;
}
