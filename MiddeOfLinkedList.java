https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp= head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int mid;
        ListNode temp1 = head;
        mid = (cnt/2);
        for (int i = 0; i < mid; i++) {
            temp1 = temp1.next;
        }     
        return temp1;

    }

}