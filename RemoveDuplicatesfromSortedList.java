class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
    		return null;
        ListNode tmp = head;
        while(tmp.next != null) {
           if(tmp.var==tmp.next.var) {
        	   tmp.next = tmp.next.next;
           }
           else 
        	   tmp = tmp.next;   
        }
        return head;
    }
}
public class RemoveDuplicatesfromSortedList {

}
