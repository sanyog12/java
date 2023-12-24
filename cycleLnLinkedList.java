https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode fst = head.next;
        ListNode slw = head;
        while(slw!=fst){

            if(fst == null || fst.next == null) return false;
            slw =slw.next;
            fst=fst.next.next;
            

        }
        return true;


    }
}