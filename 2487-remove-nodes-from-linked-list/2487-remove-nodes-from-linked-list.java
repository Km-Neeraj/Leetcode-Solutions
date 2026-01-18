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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        int max=0;
        ListNode p=null;
        ListNode c=head;
        while(c!=null)
        {
          if(c.val>=max)
          {
            max=c.val;
            p=c;
          }
          else 
          {
            p.next=c.next;
          }
          c=c.next;
        }
        return reverse(head);

        
    }
    ListNode reverse(ListNode head)
    {
        ListNode p=null;
        ListNode c=head;
        while(c!=null)
        {
           ListNode next=c.next;
           c.next=p;
           p=c;
           c=next;
        }
        return p;
    }
}