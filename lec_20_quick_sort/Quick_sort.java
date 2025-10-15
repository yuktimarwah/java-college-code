public class Quick_sort {
    public static int partition(int[] nums,int low,int high){
        int pivot = nums[high];
        int index = low -1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                index++;
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
            }
        }
        index++;
        int temp = nums[index];
        nums[index] = nums[high];
        nums[high] = temp;
        return index;
    }
    public static void quick_sort(int nums[],int low,int high){
        if(low<high){
            int pivot_index = partition(nums, low, high);
            quick_sort(nums,low,pivot_index -1);
            quick_sort(nums, pivot_index +1, high);
        }
    }
    public static void main(String[] args){
        int[] nums = {5,0,3,-1,6,2};
        quick_sort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(i+" ");
        }
    }
}
