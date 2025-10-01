public class Linear_Search {

    public static int linear_search(int arr[],int target){
        int n = arr.length;
        for(int i=0;i<n; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr [] = {10,20,-1,5,0,3};
        int target=5;
        int result = linear_search(arr,target);
        if(result != -1){
            System.out.println("element found at index ="+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
