public class Two_pointer_swap {

    public static void Reverse_Array(int[] arr){
        int s=0,e=arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }


    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Reverse_Array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
