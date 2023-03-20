// https://leetcode.com/problems/swap-nodes-in-pairs

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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode curr=head.next.next;
        ListNode prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null){
            prev.next=curr.next;
            ListNode Next=curr.next.next;
            curr.next.next=curr;
            prev=curr;
            curr=Next;
        }
        prev.next=curr;
        return head;
    }
}