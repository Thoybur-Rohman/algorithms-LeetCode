/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) 
    {
       
        int nodeFromBeginning = Size(head) - n + 1;

        ListNode  prev = null;
        ListNode  temp = head;
        for (int i = 1; i < nodeFromBeginning;
             i++) // loop until the node before the one to
                  // be deleted is reached
        {
            prev = temp;
            temp = temp.next;
        }
        if (prev
            == null) // if the first node is to be deleted
        {
            head = head.next; // update the head node to the
                              // next node
            return head; // return the updated head node
        }
        else // if any other node is to be deleted
        {
            prev.next
                = prev.next
                      .next; // skip the node to be deleted
                             // by updating the reference of
                             // the previous node
            return head; // return the head node
        }
        
    }
       public int Size(ListNode node)
    {
        int size =0;
        while(node!= null)
        {
            node = node.next;
            size++;
        }
        return size;
    }
}
