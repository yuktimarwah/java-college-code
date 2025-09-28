import java.util.Scanner;

public class Prime_or_not {

    public static boolean prime_cheak(int a){
            if(a<=1){
                return false;
            }
            else if(a>=2){
                for(int i=2;i<a;i++){
                    if(a%i==0){
                        return false;
                    }
                }
            }
            return true;
        }

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
         sc.close();
        boolean result = prime_cheak(a);

        if(result){
            System.out.println("yes,it is prime");
        }
        else{
            System.out.println("no");
        }
       
    }
}
