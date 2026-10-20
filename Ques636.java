// 636. Exclusive Time of Functions

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] curr = log.split(":");

            int id = Integer.parseInt(curr[0]);
            String type = curr[1];
            int time = Integer.parseInt(curr[2]);

            if (type.equals("start")) {
                if (!st.isEmpty()) {
                    ans[st.peek()] += time - prevTime;
                }

                st.push(id);
                prevTime = time;

            } else {
                ans[st.peek()] += time - prevTime + 1;
                st.pop();
                prevTime = time + 1;
            }
        }

        return ans;
    }
}
