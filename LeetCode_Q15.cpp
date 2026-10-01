#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int idx = 0;
        for(int i=0; i< nums.size()-2; i++) {
            for(int j=1; j<nums.size()-1; j++) {
                for(int k=2; k<nums.size(); k++) {
                    if(nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
                        ans[idx].push_back(nums[i]);
                        ans[idx].push_back(nums[j]);
                        ans[idx].push_back(nums[k]);
                    }
                }
            }
            idx++;
        }
        return ans;

    }
};

int main() {
    Solution sol;
    vector<int> nums = {-1,0,1,2,-1,-4};

    vector<vector<int>> ans = sol.threeSum(nums);

    cout << "Output : " << endl;

    for(int j=0; j<ans.size()-1; j++) {
        for(int k=0; k<ans[j].size(); k++) {
            cout << ans[j][k] << " ";
        }
    }
    return 0;
}