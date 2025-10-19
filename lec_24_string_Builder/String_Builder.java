
public class String_Builder {
    public static void main(String [] args){
        StringBuilder str = new StringBuilder("java");
        System.out.println(str);
        System.out.println(str.append(" programming")); 
        System.out.println(str.insert(4," advance"));
        System.out.println(str.replace(0,4,"Python"));
        System.out.println(str.charAt(1));
        System.out.println(str.substring(0,6));
        System.out.println(str.reverse());

    }
}
