https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode result = new ListNode();
     ListNode head = result;
     
     int carry = 0;
     int temp = 0;

    while(l1 != null && l2 != null){
        temp = l1.val + l2.val + carry;
        carry = temp/10;
        temp = temp%10;

        result.next = new ListNode(temp);
        result = result.next;

        l1 = l1.next;
        l2 = l2.next;
    }
    while(l1 != null){
        temp = l1.val+carry;
        carry = temp/10;
        temp = temp % 10;

        result.next = new ListNode(temp);
        result = result.next;

        l1 = l1.next;
    }
    while(l2 != null){
        temp = l2.val+carry;
        carry = temp/10;
        temp = temp % 10;

        result.next = new ListNode(temp);
        result = result.next;

        l2 = l2.next;
    }
    if(carry==1){
        result.next = new ListNode(1);
    }
    return head.next;
    }

}
