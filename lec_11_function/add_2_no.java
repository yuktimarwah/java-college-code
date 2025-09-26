import java.util.Scanner;

public class add_2_no {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st no.");
        int a = sc.nextInt();
        System.out.println("enter the 2nd no.");
        int b = sc.nextInt();
        sc.close();

        System.out.print("sum of 2 numbers = ");
        System.out.println(add(a,b));
    }
}
