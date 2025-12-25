import java.util.*;

public class Prev {
    public static int[] prevgreater(int[] arr){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] ans = prevgreater(arr);
        for(int i=0;i<ans.length;i++){
        System.out.print(ans[i] + " ");
        }
    }
}
