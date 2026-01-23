import java.util.*;

public class Merge {
    public static node merge(node list1,node list2){
        node head = new node(1000);
        node t = head;
        node t1 = list1;
        node t2 = list2;
        while(t1!=null && t2!=null){
            if(t1.val <t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t= t2;
                t2 = t2.next;
            }
            
        }
        if(t1==null){
                t.next = t2;
            }
            else{
                t.next = t1;
            }
            return head.next;
    }
}
