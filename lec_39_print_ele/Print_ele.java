class Stack{
    int arr[];
   int capacity;
   int top;
   // constructor 
   Stack(int size){
    arr = new int[size];
    capacity = size;
    top = -1;
   }
   //insert element
   void push(int data){
    if(top==capacity-1){
        System.out.println("Stack overflow");
        return;
    }
    arr[++top] = data;
    System.out.println(data + " inserted..");
   }
   void print(){
    if(top==-1){
        System.out.println("Stack is empty");
        return;
    }
    for(int i=0;i<=top;i++){
        System.out.println(arr[i] + " ");
    }
   }
}
public class Print_ele {
    public static void main(String[] args) {
    Stack st = new Stack(5);
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println("Stack Created...!");
    st.print();
   }
}
