public class Circular {
    int arr[];
    int front,rear;
    int n;
    circular(int size){
        arr = new int[size];
        front = rear = -1;
        n = size;
    }
    boolean isfull(){
        return (rear+1)%n == front;
    }
    void enqueue(int x){
        if(isfull()){
            System.out.println("Queue is full");
            return;
        }
        if(rear==-1){
            front=0;
        }
        rear = (rear+1)%n;
        arr[rear] = x;
    }
    
}
