public class FromEnd {
    public static class Node {
        int data; // value
        Node next; // address of next node

         Node(int data){
            this.data = data; 
        }
    }

    public static Node NthNode(Node head,int p){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - p+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }


     public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(100);
       

        a.next = b;       
        b.next = c;      
        c.next = d;      
        d.next = e;
        e.next = f;
        Node temp = NthNode(a,3);
        
        System.out.println(temp.data);
     }
    }
