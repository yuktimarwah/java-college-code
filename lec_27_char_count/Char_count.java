public class Char_count {
    public static String count_char(String s1){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i =0;i<s1.length();i++){
            if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                count++;
            }
            else{
                result.append(s1.charAt(i));
                result.append(count);
                count = 1;
            }


            
        }
        return result.toString();

    }
    public static void main(String[] args){
        String s1 = "aaabccdd";
        System.out.println(count_char(s1));
    }
}
