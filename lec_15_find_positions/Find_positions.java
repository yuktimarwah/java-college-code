import java.util.Arrays;
public class Find_positions {

    static int binary_search(int [] nums,int target,boolean flag){
        int s=0,e=nums.length-1;
        int index = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                index = mid;
                if(flag){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(nums[mid]<target){
                s = mid+1;
            } 
            else{
                e=mid-1;
            }
        }
        return index;
    }

    public static int [] search_range(int [] nums,int target){
        int result[] = new int[2];
    
        result[0] = binary_search(nums, target,true);
        result[1] = binary_search(nums, target, false);
        return result;
    }




    public static void main (String[] args){
        int nums[] = {1,2,3,3,3,3,3,4,5,6,7,8};
        int target = 3;
        int[] r = search_range(nums,target);
        System.out.println(Arrays.toString(r));
    }
}
