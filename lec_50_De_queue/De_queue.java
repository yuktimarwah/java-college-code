public class De_queue {
    {
        boolean isEmpty(){
            return front == -1;
        }
    }
    // insert at front
    void insertAtRear(int key){
        if(isfull()){
            System.out.println("Queue is already full");
            return;
        }
        if(front == -1){
            front = rear = 0;
        }
        else if(front == 0){
            front = n-1;
        }
        else{
            front--;
        }
        arr[front] = key;
        System.out.println(key + "inserted");
    }
    // insert at rear
    void insertAtRear(int key){
        if(isfull()){
            System.out.println("Queue is already full");
            return;
        }
        if(front == -1){
            front = rear = 0;
        }
        else if(rear == n-1){
            rear = 0;
        }
        else{
            rear++;
        }
        arr[front] = key;
        System.out.println(key + "inserted");
    }
    //printQueue
    void print(){
        if(isEmpty()){
            System.out.println("queue is empty"); return;
        }
        int i= front;
        while(true){
            System.out.println(arr[i] + " ");
            if(i == rear) break;
            i = (i+1)%n;
        }
        System.out.println();
    }
    //remove from front
    // remove from rear
    //
}
