

public class Remove_vowels {
    public static void main(String[] args){
       
        String str = "Java Programming";
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!(ch =='a'||ch=='o'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                sb.append(ch);
            }
         }
         System.out.print(sb);


    }
}
