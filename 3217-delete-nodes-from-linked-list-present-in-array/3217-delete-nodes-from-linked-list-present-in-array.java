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
    public ListNode modifiedList(int[] nums, ListNode head) {

        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        ListNode curr=head;
        HashSet<Integer> res=new HashSet<>();
        for(int n:nums)
        {
           res.add(n);
        }
        while(curr!=null)
        {
           if(res.contains(curr.val))
           {
              prev.next=curr.next;
           }
           else 
           {
              prev=curr;
           }
           curr=curr.next;
        }

        return temp.next;
    }
}