#include <iostream>
#include <vector>
using namespace std;

class Solution {
    void merge(vector<int>& nums1, vector<int>& nums2, vector<int>& ans) {
        int end1 = nums1.size();
        int end2 = nums2.size();
        int start1 = 0;
        int start2 = 0;

        // Correct merging logic
        while (start1 < end1 && start2 < end2) {
            if (nums1[start1] < nums2[start2]) {
                ans.push_back(nums1[start1]);
                start1++;
            } else {
                ans.push_back(nums2[start2]);
                start2++;
            }
        }

        // Append remaining from nums1
        while (start1 < end1) {
            ans.push_back(nums1[start1]);
            start1++;
        }

        // Append remaining from nums2
        while (start2 < end2) {
            ans.push_back(nums2[start2]);
            start2++;
        }
    }


    double findMedian(vector<int> mergeNums) {
        double median;
        int midInx;
        int size = mergeNums.size();
        if(size % 2 != 0) {
            midInx = size/2 - 1;
            median =  mergeNums[midInx];
        }
        else {
            midInx = size/2;
            median = (mergeNums[midInx] + mergeNums[midInx-1]) / 2;
        }

        return median;
    }
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> mergeNums;
        merge(nums1, nums2, mergeNums);

        return findMedian(mergeNums);


    }
};

int main() {
    Solution sol;
    vector<int> nums1 = {1, 3};
    vector<int> nums2 = {2};

    double median = sol.findMedianSortedArrays(nums1, nums2);
    cout << "Median: " << median << endl;

    return 0;
}