// 1441. Build an Array With Stack Operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            ans.add("Push");

            if (idx < target.length && target[idx] != i) {
                ans.add("Pop");
            } else if (idx < target.length) {
                idx++;
            }

            if (idx == target.length) {
                break;
            }
        }
        return ans;
    }
}