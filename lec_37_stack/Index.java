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
}
public class Index {
   public static void main(String[] args) {
    Stack st = new Stack(5);
    System.out.println("Stack Created...!");
   }
}
