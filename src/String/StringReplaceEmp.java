package String;

public class StringReplaceEmp {
    public static void main(String args[]){
        String str="Hello World";
        System.out.println( str.replace( 'H','W' ) );//字符串中H换成W
        System.out.println( str.replaceFirst("He", "Wa") );//字符串中He换成Wa
        System.out.println( str.replaceAll("He", "Ha") );
    }
}
