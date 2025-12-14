public class ByArray {
    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int x){
            if(isfull()){
                System.out.println("stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if(isempty()){
                System.out.println("stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx -1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(isempty()){
                System.out.println("stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        boolean isfull(){
            if(idx==arr.length) return true;
            else return false;
        }
        boolean isempty(){
            if(idx==0) return true;
            else return false;
        }
        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }
    
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(8);
        s.push(6);
        s.push(2);
        s.display();
        s.pop();
        s.display();
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isempty());
        s.push(9000);
        s.display();

    }
    
}
