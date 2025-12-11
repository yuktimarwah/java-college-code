import java.util.Scanner;
public class Operators{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the 1st no.");
        int a = sc.nextIn();

        System.out.println("enter the 1st no");

    }
}





import java.util.Scanner;
public class User_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter the 1st number");
        int a = sc.nextInt();

        System.out.println("enter the 2nd number");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your name");
        String str = sc.nextLine();

       /*  float f = sc.nextFloat();
        String str = sc.nextLine();
        boolean fig = sc.hasNextBoolean(); */

        System.out.println("Your name=" +str);
        System.out.println("the sum of" +a+ "and" +b+ " "+(a+b));
        sc.close();

    }
}