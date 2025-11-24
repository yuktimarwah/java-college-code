public class StackList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public class Stack_list{
        Node top = null;
        //insert
        void push(int x){
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
            System.out.println(x+ "Inserted");
        }
        // remove element
        int pop(){
            if(top==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        void print(){
            if(top == null){
                System.out.println("stack is empty");
                return;
            }
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack_list st = new Stack_list();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.print();
        int pop = st.pop();
        System.out.println("pop element = " + pop);
        st.print();
        int peek = st.peek();
        System.out.println("peek element = " + peek);
    }
}
