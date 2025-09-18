import java.util.Scanner;
public class Drive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no.");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you are not eligible to drive");       
         }

        

    }
}
