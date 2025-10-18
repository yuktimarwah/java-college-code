import java.util.Scanner;

public class S_reverse {

    public static String reverse_string(String s1){
        int s=0,e=s1.length()-1;
        StringBuilder r = new StringBuilder(s1);
        while(s<e){
            char temp = r.charAt(s);
            r.setCharAt(s,r.charAt(e));
            r.setCharAt(e,temp);
            s++;
            e--;
        }
        return r.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        String result = reverse_string(s1);
        System.out.println(result);
    }
    
}
