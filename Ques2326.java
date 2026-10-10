// 2326. Spiral Matrix IV

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        int[][] res = new int[m][n];

        // Initialize every cell to -1
        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(res[i], -1);
        }

        ListNode dummy = head;

        while (left <= right && top <= bottom && dummy != null) {

            // Left to Right
            for (int i = left; i <= right && dummy != null; i++) {
                res[top][i] = dummy.val;
                dummy = dummy.next;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom && dummy != null; i++) {
                res[i][right] = dummy.val;
                dummy = dummy.next;
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left && dummy != null; i--) {
                    res[bottom][i] = dummy.val;
                    dummy = dummy.next;
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top && dummy != null; i--) {
                    res[i][left] = dummy.val;
                    dummy = dummy.next;
                }
                left++;
            }
        }

        return res;
    }
}