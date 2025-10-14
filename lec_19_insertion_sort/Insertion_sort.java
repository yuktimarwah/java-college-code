public class Insertion_sort {
    public static void insertion_sort(int nums[]){
        int n = nums.length;
        for(int i=1;i<n;i++){
            int key = nums[i];
            int j =i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public static void main(String[] args){
        int nums[] = {5,4,3,1,2};
        insertion_sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
