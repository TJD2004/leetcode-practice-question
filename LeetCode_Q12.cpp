#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>

using namespace std;

class Solution {
public:
    string intToRoman(int num) {
        // Ordered from highest to lowest
        vector<pair<int, string>> roman = {
            {1000, "M"}, {900, "CM"},
            {500, "D"},  {400, "CD"},
            {100, "C"},  {90, "XC"},
            {50, "L"},   {40, "XL"},
            {10, "X"},   {9, "IX"},
            {5, "V"},    {4, "IV"},
            {1, "I"}
        };

        string result = "";

        for (int i = 0; i < roman.size(); ++i) {
            int value = roman[i].first;
            string symbol = roman[i].second;

            while (num >= value) {
                result += symbol;
                num -= value;
            }
        }
        return result;
    }
};

int main() {
    Solution sol;

    // Test cases
    int test1 = 3;
    int test2 = 4;
    int test3 = 9;
    int test4 = 58;
    int test5 = 1994;

    cout << test1 << " -> " << sol.intToRoman(test1) << endl;
    cout << test2 << " -> " << sol.intToRoman(test2) << endl;
    cout << test3 << " -> " << sol.intToRoman(test3) << endl;
    cout << test4 << " -> " << sol.intToRoman(test4) << endl;
    cout << test5 << " -> " << sol.intToRoman(test5) << endl;

    return 0;
}
