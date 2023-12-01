https://leetcode.com/problems/merge-two-sorted-lists/







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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode(); 
        ListNode temp = newnode;
     while (list1!=null && list2!=null){
         if(list1.val <= list2.val){
            //  newnode.val = list1.val;
             newnode.next = new ListNode(list1.val);
             list1 = list1.next;
         }
         else{
            //  newnode.val = list2.val;
             newnode.next = new ListNode(list2.val);
             list2 = list2.next;
             
         }
        newnode = newnode.next;
     }   
     while(list1 != null){
          newnode.next = new ListNode(list1.val);
         
         list1 = list1.next;
          newnode = newnode.next;
     }
     
     while(list2 != null){
          newnode.next = new ListNode(list2.val);
         
         list2 = list2.next;
          newnode = newnode.next;
     }
     return temp.next;
    }
}