package in class code.lec_30_linkedList_876;

public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast = fast.next.next;
    }
    return slow;
}
