// 3. Longest Substring Without Repeating Characters


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = 0;
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!q.contains(ch)) {
                q.offer(ch);
                length++;
            } else {
                maxLength = Math.max(maxLength, length);

                while (q.peek() != ch) {
                    q.poll();
                    length--;
                }

                q.poll();
                length--;

                q.offer(ch);
                length++;
            }
        }

        return Math.max(maxLength, length);
    }
}
