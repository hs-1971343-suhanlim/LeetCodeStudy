class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	ListNode tmp = new ListNode();
    	ListNode a = tmp;

        while(list1!=null&&list2!=null) {
        	if(list1.val<=list2.val) {
        		a.next = new ListNode(list1.val);
        		list1 = list1.next;
        	}
        	else {
        		a.next = new ListNode(list2.val);
        		list2 = list2.next;
        	}
        	a = a.next;
        }
        if(list1 == null)
        	a.next = list2;
        if(list2 == null)
        	a.next = list1;
        return tmp.next;
    }
}

public class MergeTwoSortedLists {
	public static void main(String arsg[]) {
		
		}
	}
}
