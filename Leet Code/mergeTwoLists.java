class Solution {
    public ListNode mergeTwoLists(ListNode l1 , ListNode l2) {
        //First we will make a dummy node 
        ListNode dummy = new ListNode(0);
        //so we can make a list on       
        ListNode head = dummy;
        
        while ( l1 !=null && l2 !=null){
            // compare the heads while it is not null 
            if ( l1.val < l2.val){
                dummy.next = l1 ;
                // here we say the next on our dummy list is whatevere 
                // is at l1 
                l1 = l1.next;
                // here we move to trhe next 1 
            }else {
                dummy.next = l2;
                    l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if (l1 !=null){
        dummy.next = l1;
        } if (l2 !=null){
        dummy.next = l2;
        }
        // as we start from 0 so we want the next one 
        return head.next;
}
}
