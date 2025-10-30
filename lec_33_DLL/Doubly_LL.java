package in class code.lec_33_DLL;

public class Doubly_LL {
    class Node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data = data;
        }

    }
    node head = null;
    node tail= null;


    void insertAtBeginning(int data){
        node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static main(string args[]){
        Doubly_LL ddl = new Doubly_LL();
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(4);

        dl

    }
}
