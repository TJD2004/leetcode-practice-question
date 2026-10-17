// 23. Merge k Sorted Lists

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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> merge = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];

            while (curr != null) {
                merge.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(merge);

        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int i = 0; i < merge.size(); i++) {
            ans.next = new ListNode(merge.get(i));
            ans = ans.next;
        }

        return dummy.next;
    }
}