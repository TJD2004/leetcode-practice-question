// 150. Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];

            if (!ch.equals("+") && !ch.equals("-") &&
                !ch.equals("*") && !ch.equals("/")) {

                st.push(Integer.parseInt(ch));

            } else {
                int prev1 = st.pop();
                int prev2 = st.pop();

                if (ch.equals("+")) {
                    st.push(prev2 + prev1);
                } else if (ch.equals("-")) {
                    st.push(prev2 - prev1);
                } else if (ch.equals("*")) {
                    st.push(prev2 * prev1);
                } else {
                    st.push(prev2 / prev1);
                }
            }
        }

        return st.peek();
    }
}