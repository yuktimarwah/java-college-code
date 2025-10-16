/* Strings : 
string is a sequence of character or collections of character in java. 
Strings are immubatable in java.
syntax:
string str = "java programming";
System.out.println(str); 
*/
public class Strings {
    public static void main(String[] args){
        String str = "java programming";
        System.out.println(str);
        System.out.println("String length = "+str.length());
        System.out.println("char at 2nd position = "+str.charAt(2));
        String subStr = str.substring(0, 6);
        System.out.println("Substring from 0 to 6 ="+ subStr);

        String s = "namaste ji";
        System.out.println("before uppercase = "+s);
        System.out.println("to uppercase ="+s.toUpperCase());
        System.out.println("after uppercase ="+s);

        String company = "FANG,is,dream.";
        String res[] = company.split(",");
        for(String e : res)System.out.println(e);
    }
}
