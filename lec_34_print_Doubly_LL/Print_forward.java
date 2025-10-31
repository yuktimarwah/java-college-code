package in class code.lec_34_print_Doubly_LL;

public class Print_forward {
    void printForward(){

    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + " ");
        temp = temp.next;                 // temp.prev      for backward printing

    }
}
    
}
