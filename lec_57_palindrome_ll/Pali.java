import java.util.*;



public class Pali {
    public static node reverse(node head){
        node curr = head;
        node prev = null;
        while(curr!=null){
            node a = curr.next;
            curr.next = prev;
            prev = curr;
            curr = a;
        }
        return prev;
    }
    public static boolean ispalindrome(node head) {
        node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node aftermid = reverse(slow.next);
        slow.next = aftermid;
        node p1= head;
        node p2= aftermid;
        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
