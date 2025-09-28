import java.util.Scanner;

public class Digit_count {
    
    public static int digit_c(int a){
        int count = 0;
        while(a!=0){
            count++;
            a/=10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        sc.close();

        System.out.print("no. of digits in number: ");
        System.out.println(digit_c(a));
    
    }
}
