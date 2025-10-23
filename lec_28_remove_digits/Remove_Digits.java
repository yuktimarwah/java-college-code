public class Remove_Digits {
    public static void main(String[] args){
        String str = "j7a3va p9rog5ramm8in5g";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                continue;
            }
            else{
                sb.append(str.charAt(i));
            }
        } 
        System.out.println(sb);
    }
}
