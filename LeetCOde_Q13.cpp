#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> m;
        m['I'] = 1;
        m['V'] = 5;
        m['X'] = 10;
        m['L'] = 50;
        m['C'] = 100;
        m['D'] = 500;
        m['M'] = 1000;

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (m[s[i]] < m[s[i + 1]]) {
                ans -= m[s[i]];
            } else {
                ans += m[s[i]];
            }
        }

        return ans;
    }
};

int main() {
    Solution sol;

    // Test cases
    string test1 = "III";       // 3
    string test2 = "IV";        // 4
    string test3 = "IX";        // 9
    string test4 = "LVIII";     // 58
    string test5 = "MCMXCIV";   // 1994

    cout << test1 << " = " << sol.romanToInt(test1) << endl;
    cout << test2 << " = " << sol.romanToInt(test2) << endl;
    cout << test3 << " = " << sol.romanToInt(test3) << endl;
    cout << test4 << " = " << sol.romanToInt(test4) << endl;
    cout << test5 << " = " << sol.romanToInt(test5) << endl;

    return 0;
}
