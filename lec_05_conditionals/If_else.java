import java.util.Scanner;
public class If_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("enter no. for day");
            int day = sc.nextInt();

            if(day==1){
                System.out.println("Monday");
            }
            else if(day==2){
                System.out.println("Tueday");
            }
            else if(day==3){
                System.out.println("wednesday");
            }
            else{
                System.out.println("other");
            }
        
    }
}
