import java.util.Scanner;
public class Digit_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("Digit sum =" +sum);
    }
}
