// 2916. Subarrays Distinct Element Sum of Squares II

/*  Brute Force Method (TLE)

class Solution {
    public int sumCounts(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            Set<Integer> st = new HashSet<>();
            for(int j=i; j<n; j++) {
                st.add(nums[j]);
                int count = st.size();

                ans = (ans + ((count*count) % 1000000007)) % 1000000007;
            }
        }

        return ans % 1000000007;
    }
}
*/