package in class code.lec_31_206_reverse_LinkedList;

public class Reverse_LinkedList {
    public ListNode reverselist(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        return prev;
    }
}
