// 739. Daily Temperature

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n = temperatures.length;

//         for(int i=0; i<n; i++) {
//             int curr = temperatures[i];
//             int j = i+1;
//             int cnt = 0;
//             while(j < n && curr >= temperatures[j]) {
//                 j++;
//             }

//             if(j >= n) {
//                 temperatures[i] = 0;
//             } else {
//                 temperatures[i] = j - i;
//             }
// ;        }

//         return temperatures;
//     }
// }

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                   temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }

        return ans;
    }
}