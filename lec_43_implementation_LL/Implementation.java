public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void InsertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void InsertAt(int idx, int val) {
            Node temp = new Node(val);
            Node t = head;
            if (idx == 0) {
                InsertAtHead(val);
                return;
            } else if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }

        int getAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }    
            return temp.data;    
        }

        void deleteAt(int idx){
            Node temp = head;
            if(idx==0){
                head = head.next;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size()){
                tail=temp;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(34);
        ll.insertAtEnd(7);
        ll.insertAtEnd(1);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.InsertAtHead(111);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(2));
        ll.deleteAt(3);
        ll.display();
        System.out.println();
        ll.InsertAt(3, 10000000);
        ll.display();
    }
}
