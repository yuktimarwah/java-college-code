public class Binary_Search {
    public static int binary_search(int nums[],int target){
        int s = 0;
        int e = nums.length -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int nums[] = {10,20,30,40,50,60,70,80,90,100,120};
        int target = 100;
        int result = binary_search(nums,target);
        if(result != -1){
            System.out.println("Element found at index =" + result);
        }
        else{
                System.out.println("element not found");
            }
    }
}



