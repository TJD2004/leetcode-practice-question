// 448. Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int[] freq = new int[n+1];

        Arrays.fill(freq, 0);

        for(int x : nums) {
            freq[x]++;
        }

        for(int i=1; i<=n; i++) {
            if(freq[i] == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}