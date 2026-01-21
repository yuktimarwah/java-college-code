import java.util.*;

import Length.Node;

public class DLL {
    public static boolean isDLLpalindrome(Node head){
        if(head==null||head.next==null) return true;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node tail = temp;
        Node h = head;
        Node t = tail;
        while(h!=t && h.prev!=t){
            if(h.val != t.val){
                return false;
            }
            h = h.next;
            t = t.prev;
        }
        return true;
    }
}
