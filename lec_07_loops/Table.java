import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();

        sc.close();

        for(int i =1;i<=10;i++){
            System.out.println(n + "X" +i+ "=" +(n*i));
        }
    }
    
}
