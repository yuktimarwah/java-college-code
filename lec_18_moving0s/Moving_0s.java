public class Moving_0s {

    public static void Moving(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }
                }
            }
        }
    
    public static void main (String[] args){
        int arr[] = {0,3,0,2,1,0,4,3,4,5};
        Moving(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
