import java.net.Socket;

public class Circular_queue {
    int arr[];
    int front;
    int rear;
    int n;
    Circular_queue(int size){
        arr = new int[size];
        front = rear = -1;
        n = size;
    }
    boolean isFull(){
        return (rear+1)%n == front;
    }
    boolean isEmpty(){
        return front == -1;
    }
    //insert element
    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full"); return;
        }
        if(front == -1) front =0;
        rear = (rear+1)%n;

        arr[rear] = data;
        System.out.println(data + " Element inserted");
    }
    //remove element
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is already empty"); return;
        }
        if(front==rear){
            front = rear = -1; return;
        }
        front = (front +1)%n;
    }
    //print element
    void print(){
        if(isEmpty()){
            System.out.println("queue is empty"); return;
        }
        int i = front;
        while(true){
            System.out.print(arr[i] +" ");
            if(i== rear) break;

            i =(i+1)%n;
        }
        System.out.println();
    }
    
    //peek
    int peek(){
        if(isEmpty()){
            return -1;
            
        }
        return arr[front];
    }
    public static void main(String[] args) {
        Circular_queue cq = new Circular_queue(10);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.print();
        cq.dequeue();
        cq.print();
        System.out.println(cq.peek());
    }
}
