package String;

import java.nio.charset.StandardCharsets;

public class testString {
    public static void main(String[] args){
        String str=new String("1122aaBB");
        int index=str.indexOf("a");
        char target=str.charAt(3);
        str.replace("1122aaBB"," 1122AABBCC ");
        str.trim();
        byte[] arr=str.getBytes();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int length=str.length();
        String upperStr=str.toUpperCase();
        System.out.println(upperStr);
        String lowerStr=str.toLowerCase();
        System.out.println(lowerStr);
        String partStr=str.substring(0,4);
        boolean bol=str.equals("123");
        System.out.print(bol);
    }
}
